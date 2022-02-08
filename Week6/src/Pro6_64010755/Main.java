package Pro6_64010755;

import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Main {
    public static void main(String[] args) {
        ATM[] atm = new ATM[10];
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if(id>=0 && id<=9) atm[id].start();
        else System.out.println("Error,Please input the ID correctly.");
        
    }
}
