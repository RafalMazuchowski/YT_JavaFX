package kurs.java.fx.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("To jest handler");
			}
		};

		button.addEventHandler(ActionEvent.ACTION, handler);
		
		EventHandler<MouseEvent> mouseHandlerLambda = e -> {
			System.out.println("To jest handler lambda");
		
		};
		
/*
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.out.println("To jest mouse handler");
				
			}
		};
*/
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);//mouseHandler);

		button.setOnAction(e -> {
			System.out.println("To jest handler setOn");
			button.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);
		}); //w ten sposób mo¿emy zdefiniowaæ EVENT tylko raz. Zostanie wykonany tylko ten nadpisany na koñcu
	}

}
