package Pro2_64010755;
import java.util.ArrayList;

public class Acount {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate = 1.5;
    private ArrayList<Transaction> transactions;

    Acount(String name,int id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void withDraw(double amount){
        transactions.add(new Transaction('W', amount, this.balance, ""));
    }

    public void deposit(double amount){
        transactions.add(new Transaction('D', amount, this.balance, ""));
    }

    public void showAllAction(){
        for(int i=0;i<transactions.size();i++){
            System.out.println(transactions.get(i).);
        }
    }
}
