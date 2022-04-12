package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
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

    private WebHistory history;

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

    public void displayHostory(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();

        for(WebHistory.Entry entry: entries){
            //System.out.println(entry);
            System.out.println(entry.getUrl()+" "+entry.getLastVisitedDate());
        }
    }

    public void back(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        if(history.getCurrentIndex()==0) return ;
        history.go(-1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void forward(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        if(entries.size()-1 == history.getCurrentIndex()) return;
        history.go(1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void getSourceCode(){
        engine.load(engine.getDocument().toString());
        
    }

}
