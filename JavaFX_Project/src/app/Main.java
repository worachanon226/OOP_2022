import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		try {

			Tabpane tabpane = new Tabpane();

			stage.setMaximized(true);

			stage.setTitle("Ya-om Ya-dom Ya-mhong");
			stage.setScene(tabpane.getScene());
			stage.show();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public static void main(String[] args) {

		launch(args);
	}
}