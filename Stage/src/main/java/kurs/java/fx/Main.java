package kurs.java.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import kurs.java.fx.controller.StackPaneController;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch (args);
		
	}

	@Override
	
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
		
		//StackPaneController controller = new StackPaneController();
		//loader.setController(controller);
		StackPane stackPane = loader.load();
		
		StackPaneController controller = loader.getController(); //Controler wpisany w FXML
		
		Scene scene = new Scene(stackPane);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pierwsze okno");
		primaryStage.show();
		
	}

}
