package Pro2_64010755;
import java.util.ArrayList;

import javax.print.event.PrintJobListener;

public class Acount {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate = 1.5;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    Acount(String name,int id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void withDraw(double amount){
        transactions.add(new Transaction('W', amount, this.balance, ""));
        this.balance -= amount;
    }

    public void deposit(double amount){
        transactions.add(new Transaction('D', amount, this.balance, ""));
        this.balance += amount;
    }

    public void showPersonal(){
        System.out.println("Name: " + this.name);
        System.out.println("Acount ID: " + this.id);
        System.out.println("Annual interest rate: " + this.annualInterestRate);
        System.out.println("Balance: " + transactions.get(transactions.size()-1).getBalance());
    }

    public void showAllAction(){
        
        System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");
        
        for(int i=0;i<transactions.size();i++){
            Transaction temp = transactions.get(i);
            System.out.println(temp.getDateCreated()+"\t\t"+temp.getType()+"\t\t"+temp.getAmount()+"\t\t"+temp.getBalance());
        }
    }
}
