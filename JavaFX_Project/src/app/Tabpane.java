package app;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public class Tabpane {
    
    private Scene scene;
    private AnchorPane anchorPane;
    private Tabpane tabpane;
    private Tab tab;

    public Tabpane(){
        tab = new Tab("New Tab");
        tabpane.getTabs().addAll(tab);

        anchorPane.setPrefWidth(1920);
        anchorPane.setPrefHeight(1080);

        anchorPane.getChildren().addAll(tabpane);

        scene = new Scene(anchorPane);
    }

    public Scene getScene(){
        return this.scene;
    }

}
