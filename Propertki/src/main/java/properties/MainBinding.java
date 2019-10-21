package properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainBinding extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BindingExample.fxml"));
		VBox vbox = loader.load();
		Scene scene = new Scene(vbox, 400, 400);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przyk³ad properties");
		stage.show();
	}

}
