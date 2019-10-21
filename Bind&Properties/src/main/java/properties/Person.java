package properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "Jon Snow");
	private IntegerProperty integerProperty = new SimpleIntegerProperty(1111);
	
	private ReadOnlyStringWrapper propertyWraper = new ReadOnlyStringWrapper(this, "readOnly", "tylko odczyt");
	private ReadOnlyStringProperty readOnlyString = propertyWraper.getReadOnlyProperty();
	
	public ReadOnlyStringProperty getReadOnlyString() {
		return propertyWraper.getReadOnlyProperty();
	}
	
	public Person() {
		
		propertyWraper.set("Jednak zmieniam wartoœæ");
		readOnlyString.get();
	}

	public StringProperty getPropertyTextField() {
		return propertyTextField;
	}

	public void setPropertyTextField(StringProperty propertyTextField) {
		this.propertyTextField = propertyTextField;
	}

	public IntegerProperty getIntegerProperty() {
		return integerProperty;
	}

	public void setIntegerProperty(IntegerProperty integerProperty) {
		this.integerProperty = integerProperty;
	}
	
	

/*
	private String name = "Jon";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
*/
}
