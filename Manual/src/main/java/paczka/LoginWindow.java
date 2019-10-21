package paczka;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginWindow extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.setPrefWidth(200);
		pane.setPrefHeight(300);

		Label loginLabel = new Label("Login");
		loginLabel.setLayoutX(28);
		loginLabel.setLayoutY(47);

		TextField loginField = new TextField();
		loginField.setLayoutX(26);
		loginField.setLayoutY(64);
		loginField.setPrefHeight(25);
		loginField.setPrefWidth(154);

		Label hasloLabel = new Label("Has³o");
		hasloLabel.setLayoutX(28);
		hasloLabel.setLayoutY(97);

		PasswordField passwordField = new PasswordField();
		passwordField.setLayoutX(26);
		passwordField.setLayoutY(114);
		passwordField.setPrefHeight(25);
		passwordField.setPrefWidth(154);

		CheckBox rememberCheckBox = new CheckBox("Zapamiêtaj");
		rememberCheckBox.setLayoutX(28);
		rememberCheckBox.setLayoutY(168);

		Button loginButton = new Button("Zaloguj");
		loginButton.setLayoutX(119);
		loginButton.setLayoutY(221);

		pane.getChildren().addAll(loginLabel, loginField, hasloLabel, passwordField, rememberCheckBox, loginButton);

		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przyk³adowy Pane");
		stage.setResizable(false);
		stage.show();

	}

}
