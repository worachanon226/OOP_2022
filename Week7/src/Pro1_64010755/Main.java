package Pro1_64010755;

public class Main {
    public static void main(String[] args) {
        Account customer1 = new Account(1,1000);
        customer1.withDraw(100);
        System.out.println(customer1 + "\n");

        CheckingAccount customer2 = new CheckingAccount(2, 5000, 5000);
        customer2.withdraw(20000);
        System.out.println(customer2 + "\n");

        SavingAccount customer3 = new SavingAccount(3, 2000);
        customer3.withdraw(3000);
        System.out.println(customer3);
    }
}
