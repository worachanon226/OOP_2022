package Pro1_64010755;
import java.util.*;

public class SavingAccount extends Account {
    
    SavingAccount(){}

    SavingAccount(int id,double balance){
        System.out.println("Saving Account");
        System.out.println("Balance is: " + balance);
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public void withdraw(double amount){
        System.out.println("Withdraw : " + amount);
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("\"Error, you can't be overdrawn.\"");
        }
    }

    public String toString(){
        return "Balance is " + balance + 
        "\nThis account was created at" + dateCreated;
    }
}
