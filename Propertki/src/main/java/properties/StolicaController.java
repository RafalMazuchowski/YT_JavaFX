package properties;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class StolicaController {
	
	@FXML
	private Tab1Controller tab1Controller;
	
	@FXML
	private Tab2Controller tab2Controller;
	
	@FXML
	private VBox tab1;
	
	@FXML
	private VBox tab2;
	
	@FXML
	public void change() {
		
		tab1Controller.setMessageTab1("Zmieniona wiadomoœæ z MainController'a z Tab1");
		tab2Controller.setMessageTab2("Zmieniona wiadomoœæ z MainController'a z Tab2");
		
		System.out.println("To jest StolicaController");
		System.out.println(tab1Controller);
		System.out.println(tab2Controller);
		
		System.out.println(tab1);
		System.out.println(tab2);
		
	}

}
