package kurs.java.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

	@FXML
	private Button button;

	public StackPaneController() {
		System.out.println("Jestem kontrolerem");
		// button - ma wartoœæ NULL do momêtu "initialize"
	}

	@FXML
	void initialize() {
		button.setText("Nowa nazwa");

	}
	
	@FXML
	public void onActionButton(ActionEvent e) {
		System.out.println("To jest metoda onActionButton"+e.getSource());
	}
	
	@FXML
	public void onMouseEntered(MouseEvent e) {
		System.out.println("To jest metoda onMouseEntered"+e.getSource());
	}

}
