package Pro3;

import javafx.application.Application;
import javafx.beans.binding.BooleanExpression;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer.Status;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{
    
    GridPane borderPane = new GridPane();
    HBox hBox = new HBox();

    Button play_pause_button = new Button("||");
    Button rewindButton = new Button("<<");
    Label volume = new Label("Volume");
    Slider volumeSlider = new Slider();

    @Override
    public void start(Stage stage) throws Exception {

        Media media = new Media(ClassLoader.getSystemResource("Pro3/Sequence03.mp4").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.play();
        mediaView.setOpacity(1);
        hBox.setPrefHeight(30);
        hBox.setMaxWidth(1920);

        volumeSlider.setValue(50);

        mediaPlayer.volumeProperty().bind(volumeSlider.valueProperty().divide(100));;

        play_pause_button.setOnAction(e->{

            if(mediaPlayer.getStatus() == Status.PLAYING){
                play_pause_button.setText(">");
                mediaPlayer.pause();
            }
            else if(mediaPlayer.getStatus() == Status.PAUSED){
                mediaPlayer.play();
                play_pause_button.setText("||");
            }

        });

        rewindButton.setOnAction(e->{
            mediaPlayer.seek(Duration.ZERO);
        });

        hBox.getChildren().addAll(play_pause_button,rewindButton,volume,volumeSlider);

        borderPane.add(mediaView,0,1);
        borderPane.add(hBox,0,0);

        Scene scene = new Scene(borderPane,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
