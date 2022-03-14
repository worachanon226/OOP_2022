package Pro3_64010755;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Program # 3");

        StackPane root = new StackPane();
        ClockPane clockPane = new ClockPane();
        Text text = new Text();

        clockPane.setHourHandVisible(true);
        clockPane.setMinuteHandVisible(true);

        clockPane.setHour((int) (new Random().nextInt(12)));
        clockPane.setMinute((int) (new Random().nextInt(31)));
        clockPane.setSecond(0);

        String hString = ((clockPane.getHour() >= 10) ? "" : "0") + Integer.toString(clockPane.getHour());
        String mString = ((clockPane.getMinute() >= 10) ? "" : "0") + Integer.toString(clockPane.getMinute());
        String sString = "00";

        text.setText(hString + ":" + mString + ":" + sString);

        text.setTextAlignment(TextAlignment.CENTER);
        text.setFont(Font.font("Veradana", 20));

        root.getChildren().addAll(clockPane, text);
        StackPane.setAlignment(text, Pos.BOTTOM_CENTER);

        primaryStage.setScene(new Scene(root, 250, 275));
        primaryStage.show();
    }
}
