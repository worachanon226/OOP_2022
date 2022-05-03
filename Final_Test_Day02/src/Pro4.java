import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Pro4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();
        ClockPane clockPane = new ClockPane();

        clockPane.setHourHandVisible(true);
        clockPane.setMinuteHandVisible(true);
        clockPane.setSecondHandVisible(true);

        root.getChildren().addAll(clockPane);

        primaryStage.setScene(new Scene(root, 250, 275));
        primaryStage.show();
    }
}
