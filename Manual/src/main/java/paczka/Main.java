package paczka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Pane.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane, 200, 300);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przyk�adowy Pane");
		stage.setResizable(false);
		stage.show();

	}

}
