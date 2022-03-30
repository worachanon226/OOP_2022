package Pro5_64010755;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    Fan fan = new Fan();
    Button pause = new Button("Pause");
    Button resume = new Button("Resume");
    Button reverse = new Button("Reverse");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Program # 5");
        BorderPane pane = new BorderPane();

        pane.setCenter(fan);
        pane.setBottom(drawHbox());

        buttonEvent();

        primaryStage.setScene(new Scene(pane, 250, 300));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private HBox drawHbox() {
        HBox hbox = new HBox(5);
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(pause, resume, reverse);
        return hbox;
    }

    private void buttonEvent() {
        pause.setOnAction(e -> {
            fan.pause();
        });

        resume.setOnAction(e -> {
            fan.resume();
        });

        reverse.setOnAction(e -> {
            fan.reverse();
        });
    }
}