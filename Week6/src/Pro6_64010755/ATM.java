package Pro6_64010755;

import java.util.Scanner;

public class ATM {
    Scanner input = new Scanner(System.in);
    private double balance = 100;

    public ATM(){}

    public void start(){
        mainMenu();
    }

    public void mainMenu(){
        int action = 0;
        System.out.println("\nMain menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
        action = input.nextInt();
        takeAction(action);
    }

    public void takeAction(int action){
        if(action==1) checkBalance();
        else if(action==2) withDraw();
        else if(action==3) deposit();
        else if(action==4) exit();
        action = 0;
        mainMenu();
    }

    public void checkBalance(){
        System.out.format("The balance is %.2f\n",balance);
    }

    public void withDraw(){
        double withdraw;
        System.out.print("Enter an amount to withdraw: ");
        withdraw = input.nextDouble();
        balance -= withdraw;
    }

    public void deposit(){
        double deposit;
        System.out.print("Enter an amount to deposit: ");
        deposit = input.nextDouble();
        balance += deposit;
    }

    public void exit(){
        System.out.print("End of Program.");
        System.exit(0);
    }
}
