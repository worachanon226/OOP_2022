package Pro1_64010755;

public class Main {
    public static void main(String[] args) {
        Account acount = new Account(1,1000);
        acount.withDraw(100);
        System.out.println(acount + "\n");

        CheckingAccount checking = new CheckingAccount(2, 5000, 5000);
        checking.withdraw(10000);
        System.out.println(checking + "\n");

        SavingAccount saving = new SavingAccount(3, 2000);
        saving.withdraw(3000);
        System.out.println(saving);
    }
}
