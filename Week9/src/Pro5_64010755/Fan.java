package Pro5_64010755;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Fan extends StackPane {
    private Timeline animation;
    private double speed = 5;
    private Pane blade = drawBlades();
    private ObservableList<Node> blades = blade.getChildren();

    Fan() {
        getChildren().addAll(drawCircle(), blade);
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> spin()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void reverse() {
        speed *= -1;
    }

    public void pause() {
        animation.pause();
    }

    public void resume() {
        animation.play();
    }

    private void spin() {
        for (int i = 0; i < blades.size(); i++) {
            Arc a = (Arc) blades.get(i);
            a.setStartAngle(a.getStartAngle() + speed);
        }
    }

    private Pane drawBlades() {
        Pane pane = new Pane();
        for (int i = 0; i < 4; i++) {
            Arc a = new Arc(125, 122.5, 90, 90, (i + 1) * 90, 45);
            a.setFill(Color.BLACK);
            a.setType(ArcType.ROUND);
            pane.getChildren().addAll(a);
        }
        return pane;
    }

    private Circle drawCircle() {
        Circle c = new Circle();
        c.setRadius(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        return c;
    }
}
