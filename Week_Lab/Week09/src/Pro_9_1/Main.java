package Pro_9_1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    Button btn = new Button("Show Table");

    TextField loanamount = new TextField();
    TextField numofyear = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Loan GUI");

        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane);

        pane.setTop(getHBox());

        btn.setOnAction(e -> {
            pane.setCenter(getTextArea());
            primaryStage.sizeToScene();
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private TextArea getTextArea() {
        TextArea textArea = new TextArea();
        textArea.setEditable(true);
        textArea.setText(getOutput());
        return textArea;
    }

    private HBox getHBox() {
        HBox hbox = new HBox(10);
        hbox.setStyle("-fx-background-color: LightGray");
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.setAlignment(Pos.CENTER_LEFT);

        Label loanAmount = new Label("Loan Amount");
        Label numofYear = new Label("Number of Years");

        loanamount.setPrefColumnCount(7);
        numofyear.setPrefColumnCount(2);

        hbox.getChildren().addAll(loanAmount, loanamount, numofYear, numofyear, btn);
        return hbox;
    }

    private double payPerMonth(double loan, int years, double interestRate) {
        double r = interestRate / 1200;
        int n = years * 12;
        return (loan * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    private String getOutput() {
        String out = "Interest Rate      Monthly Payment         Total Payment\n";
        double loan;
        int years;
        try {
            loan = Double.parseDouble(loanamount.getText());
            years = Integer.parseInt(numofyear.getText());
        } catch (Exception e) {
            return "";
        }
        for (double i = 5; i <= 8; i += 0.25) {
            double monthlyPayment = payPerMonth(loan, years, i);
            out += String.format("%-24.2f%-32.2f%-8.2f\n", i, monthlyPayment, monthlyPayment * 12 * years);
        }
        return out;
    }
}
