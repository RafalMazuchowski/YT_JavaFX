package properties;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ControllerObservableList {

	@FXML
	private ComboBox<Person2> comboBox;

	@FXML
	private TextField nameTextField;

	@FXML
	private TextField surnameTextField;

	@FXML
	private Button addButton;

	@FXML
	private Button removeButton;

	private ObservableList<Person2> personList;
	private ListProperty<Person2> listProperty;
	private Person2 person;

	@FXML
	public void initialize() {
		List<Person2> arrayList = new ArrayList<>();
		arrayList.add(new Person2("John", "Rambo"));
		arrayList.add(new Person2("James", "Bond"));
		arrayList.add(new Person2("Indiana", "Jones"));
		arrayList.add(new Person2("Robin", "Hood"));

		listProperty = new SimpleListProperty<>();
		personList = FXCollections.observableArrayList(arrayList);
		comboBox.getItems().addAll(personList);
		listProperty.set(personList);

		comboBox.itemsProperty().bindBidirectional(listProperty);
		personList.addListener(this::onChanged);
	}

	@FXML
	void addPerson() {
		person = new Person2(nameTextField.getText(), surnameTextField.getText());
		personList.add(person);
		System.out.println(personList);

	}

	@FXML
	void deletePerson() {
		Person2 person = comboBox.getSelectionModel().getSelectedItem();
		personList.remove(person);
		System.out.println(personList);

	}

	private void onChanged(Change change) {
		while (change.next()) {
			if (change.wasRemoved()) {
				System.out.println("Coœ zosta³o usuniête");
			} else if (change.wasRemoved()) {
				System.out.println("Coœ zosta³o dodane");
			}
		}

	}
}
