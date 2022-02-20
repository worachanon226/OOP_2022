package Pro1_64010755;

import java.util.*;

public class CheckingAccount extends Account {
    
    double overDraftLimit;

    CheckingAccount(int id,double balance, double overDraftLimit){
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + overDraftLimit);
        System.out.println("Balance is: " + balance);
        this.id = id;
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
        this.dateCreated = new Date();
    }

    public void withDraw(double amount){
        if(amount <= balance+overDraftLimit){
            balance -= amount;
        }
        else{
            System.out.println("Error, you are withdrawing excessively.");
        }
    }

    public String toString(){
        return "Balance is " + balance + 
        "\nThis account was created at" + dateCreated;
    }
}
