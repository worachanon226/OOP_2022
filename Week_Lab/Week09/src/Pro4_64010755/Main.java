package Pro4_64010755;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Program # 4");

        Car car = new Car();
        car.setOnMouseClicked(e -> car.pause());
        car.setOnMouseReleased(e -> car.play());

        car.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP)
                car.increaseSpeed();
            else if (e.getCode() == KeyCode.DOWN)
                car.decreaseSpeed();
        });
        Scene scene = new Scene(car, 600, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        car.requestFocus();
    }
}
