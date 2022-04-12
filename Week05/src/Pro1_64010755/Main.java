package Pro1_64010755;

public class Main {
    public static void main(String[] args) {
        Acount customer1 = new Acount(1122, 20000);
        customer1.setAnnualInterestRate(4.5);
        customer1.withDraw(2500);
        customer1.deposit(3000);
        System.out.format("ID-%d, Balance is $%f\n",customer1.getID(),customer1.getBalance());
        System.out.format("ID-%d, Monthly Interest is %f\n",customer1.getID(),customer1.getMonthlyInterest());
        System.out.println("ID-" + customer1.getID() +", Created in " + customer1.getDateCreated());
    }
}
