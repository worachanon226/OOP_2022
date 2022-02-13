package Pro2_64010755;
import java.util.*;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date dateCreated;

    Transaction(char type, double amount, double balance,String description){
        dateCreated = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        
        if(type == 'W') withDraw(amount);
        if(type == 'D') deposit(amount);
    }

    private void withDraw(double amount){
        this.balance -= amount;
    }
    private void deposit(double amount){
        this.balance += amount;
    }

    public char getType(){
        return this.type;
    }

    public double getAmount(){
        return this.amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getDescription(){
        return this.description;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }
}
