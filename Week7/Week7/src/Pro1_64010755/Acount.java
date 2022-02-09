package Pro1_64010755;
import java.util.*;

public class Acount {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Acount(){}

    public Acount(int id,double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getID(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setID(int new_id){
        id = new_id;
    }

    public void setBalance(double new_balance){
        balance = new_balance;
    }

    public void setAnnualInterestRate(double new_annualInterestRate){
        annualInterestRate = new_annualInterestRate / 100.0;
    }

    public void withDraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }
        
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12.0;
    }

    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }

    public Date getDateCreated(){
        return dateCreated;
    }
}

class SavingAcount extends Acount{

}
