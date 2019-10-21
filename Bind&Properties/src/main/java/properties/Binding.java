package properties;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.binding.When;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Binding {

	public static void main(String[] args) {
		bindings();
	}

	public static void bindings() {
		DoubleProperty a = new SimpleDoubleProperty(3.0);
		IntegerProperty b = new SimpleIntegerProperty(4);
		
		System.out.println("DZIA£ANIA MATEMATYCZNE");
		
		NumberBinding resultAdd = a.divide(b);
		System.out.println("Wynik dodawania: "+resultAdd.intValue());
		
		NumberBinding resultSub = a.subtract(b);
		System.out.println("Wynik odejmowania: "+resultSub.intValue());
		
		NumberBinding resultMultuply = a.multiply(b);
		System.out.println("Wynik mno¿enia: "+resultMultuply.longValue());
		
		NumberBinding negate = a.negate();
		System.out.println("Negacja liczby: "+negate.intValue());
		
		DoubleBinding resultDiv = a.add(b);
		System.out.println("Wynik dzielenia: "+resultDiv.doubleValue());
		
		System.out.println("\nWARUNKI");
		
		BooleanBinding value = a.isEqualTo(b);
		System.out.println("Czy A jest równa B: "+value.get());
		
		System.out.println("\nDZIA£ANIA NA STRINGACH");
		StringProperty s1 = new SimpleStringProperty("Ala ");
		StringProperty s2 = new SimpleStringProperty("ma ");
		StringProperty s3 = new SimpleStringProperty("kota :3");
		
		StringExpression se = (s1).concat(s2).concat(s3);
		System.out.println(se.get());
		
		System.out.println("\nU¿ycie klasy WHEN");
		StringBinding result = new When(a.lessThan(b)).then("mniejsza").otherwise("wiêksza");
		System.out.println("Liczba " + a.intValue() + " jest "+result.get()+"od liczby "+b.intValue());
		
		System.out.println("\nFORMATER");
		DoubleProperty longDouble = new SimpleDoubleProperty(2.2345678456);
		StringExpression output = Bindings.format("Format liczby double ("+longDouble.doubleValue()+") : %.2f", longDouble);
		System.out.println(output.get());
	}

}
