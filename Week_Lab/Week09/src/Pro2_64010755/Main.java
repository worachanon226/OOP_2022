package Pro2_64010755;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    TextField[] textfield = new TextField[100];

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Program # 2");

        GridPane root = new GridPane();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                TextField tf = new TextField();
                tf.setPrefWidth(40);
                tf.setPrefHeight(40);
                tf.setAlignment(Pos.CENTER);

                tf.setText(Integer.toString((int) new Random().nextInt(2)));
                textfield[i * 10 + j] = tf;

                GridPane.setConstraints(textfield[i * 10 + j], j, i);

            }
        }

        root.getChildren().addAll(textfield);

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }
}
