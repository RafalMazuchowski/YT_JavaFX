package properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Stolica extends Application{

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/Stolica.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Include FXML");
		stage.setResizable(false);
		stage.show();
		
	}

}
