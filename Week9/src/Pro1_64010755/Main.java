package Pro1_64010755;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Main extends Application {

    ImageView[] imgView = new ImageView[4];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Program # 1");
        GridPane root = new GridPane();

        for (int i = 0; i < 4; i++) {
            imgView[i] = new ImageView(getClass().getResource(i + ".png").toExternalForm());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                GridPane.setConstraints(imgView[(2 * i) + j], j, i);
                imgView[(2 * i) + j].setFitWidth(400);
                imgView[(2 * i) + j].setFitHeight(200);
            }
        }
        root.getChildren().addAll(imgView);

        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }
}
