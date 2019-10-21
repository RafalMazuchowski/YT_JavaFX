package properties;

import java.nio.channels.NetworkChannel;

import javafx.beans.Observable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerListener {

	@FXML
	private TextField nameTextField;

	@FXML
	private Label nameLabel;

	@FXML
	private TextField surnameTextField;

	@FXML
	private Label surnameLabel;

	@FXML
	private TextField yearTextField;

	@FXML
	private CheckBox confirmCheckBox;

	@FXML
	private Button logginButton;

	@FXML
	private Label ageLabel;

	private BooleanProperty checkBoxProperty = new SimpleBooleanProperty();

	@FXML
	public void initialize() {
		
		confirmCheckBox.selectedProperty().bindBidirectional(checkBoxProperty);
		
		nameTextField.textProperty().addListener(new ChangeListener<String>() {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println("Stara wartoœæ: "+oldValue);
				System.out.println("Nowa wartoœæ: "+newValue);
				if(newValue.isEmpty()) {
					surnameTextField.setText("");
				}
			}
		});
		
		surnameTextField.focusedProperty().addListener((Observable, oldValue, newValue)->{
			if (newValue) {
				System.out.println("Jesteœ w polu nazwisko");
			} else {
				System.out.println("By³eœ w polu nazwisko");
			}
			
		});
		
		yearTextField.textProperty().addListener(ControllerListener::yearTextFieldListener);

		checkBoxProperty.addListener((Observable, oldValue, newValue)->{
			if (newValue) {
				System.out.println("Zaznaczono");
			} else {
				System.out.println("Odznaznaczono");
			}
			
		});
	}
	
	private static void yearTextFieldListener(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		System.out.println("Tutaj: "+observable);
		System.out.println("Nowa wartoœæ: "+newValue);
		
	}
}