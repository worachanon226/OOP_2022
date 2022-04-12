package Pro4_64010755;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Car extends Pane {

    private double posX = 0;
    private double posY = 100;
    private double r = 5;

    // Car Component
    private Rectangle body;
    private Polygon upper;
    private Circle w1;
    private Circle w2;
    private Timeline animation;

    Car() {
        drawCar();
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveCar()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void drawCar() {
        getChildren().clear();

        body = new Rectangle(posX, posY - 20, 50, 10);
        upper = new Polygon(posX + 10, posY - 20, posX + 20, posY - 30, posX + 30, posY - 30, posX + 40, posY - 20);
        w1 = new Circle(posX + 15, posY - 5, r);
        w2 = new Circle(posX + 35, posY - 5, r);

        body.setFill(Color.AQUA);
        upper.setFill(Color.LIGHTBLUE);
        w1.setFill(Color.BLACK);
        w1.setFill(w1.getFill());
        getChildren().addAll(body, upper, w1, w2);
    }

    public void pause() {
        animation.pause();
    }

    public void play() {
        animation.play();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 1);
    }

    public void decreaseSpeed() {
        animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : 0);
    }

    protected void moveCar() {
        if (posX <= getWidth()) {
            posX += 1;
        } else
            posX = 0;

        drawCar();
    }

}
