package Pro1_64010755;
import java.util.*;

public class CheckingAccount extends Account {
    
    private double overDraftLimit;

    CheckingAccount(){}

    CheckingAccount(int id,double balance, double overDraftLimit){
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + overDraftLimit);
        System.out.println("Balance is: " + balance);
        this.id = id;
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
        this.dateCreated = new Date();
    }

    public void withdraw(double amount){
        System.out.println("Withdraw : " + amount);
        if(amount <= balance+overDraftLimit){
            balance -= amount;
        }
        else{
            System.out.println("\"Error, you are withdrawing excessively.\"");
        }
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overDraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return this.overDraftLimit;
    }

    public String toString(){
        return "Balance is " + balance + 
        "\nThis account was created at" + dateCreated;
    }
}
