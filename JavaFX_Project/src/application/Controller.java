package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controller implements Initializable{

    @FXML
	private WebView webView;
	
    @FXML
	TextField textField;

    @FXML
    Button loadButton;
	
	private WebEngine engine;
    private String homePage;
    private double webZoom;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = webView.getEngine();
        homePage = "www.google.com";
        webZoom = 1;

        textField.setText(homePage);
		loadPage();
	}
	
	public void loadPage() {
		engine.load("http://"+textField.getText());
	}

	public void refreshPage(){
        engine.reload();
    }

    public void zoomIn(){
        webZoom += 0.25;
        webView.setZoom(webZoom);
    }

    public void zoomOut(){
        webZoom -= 0.25;
        webView.setZoom(webZoom);
    }

}
