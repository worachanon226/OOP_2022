package Pro2_64010755;

public class Main {
    public static void main(String[] args) {
        Acount customer1 = new Acount("George", 1122, 1000);
        
        customer1.deposit(30);
        customer1.deposit(40);
        customer1.deposit(50);

        customer1.withDraw(5);
        customer1.withDraw(4);
        customer1.withDraw(2);

        customer1.showPersonal();
        customer1.showAllAction();
    }
}
