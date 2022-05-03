import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFX_temp extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
