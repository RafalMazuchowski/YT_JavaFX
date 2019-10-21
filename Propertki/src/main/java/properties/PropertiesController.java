package properties;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PropertiesController {

	@FXML
	private TextField textField;

	@FXML
	private Label labelName;

	private Person person = new Person();

	@FXML
	public void initialize() {
		textField.textProperty().bindBidirectional(person.getPropertyTextField());
		labelName.textProperty().bind(person.getPropertyTextField());
		/*
		textField.setText(person.getName());
		labelName.setText(person.getName());
		*/
	}

	@FXML
	void write() {
		person.getIntegerProperty().set(2222);
		System.out.println(person.getIntegerProperty().get());
		System.out.println(person.getIntegerProperty().getValue());

	}

}
