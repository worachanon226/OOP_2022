package Pro1_64010755;
import java.util.*;

public class SavingAccount extends Account {
    
    SavingAccount(int id,double balance){
        System.out.println("Checking Account");
        System.out.println("Balance is: " + balance);
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String toString(){
        return "Balance is " + balance + 
        "\nThis account was created at" + dateCreated;
    }
}
