package Pro3_64010755;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "White", true);
        Rectangle r2 = new Rectangle(5, 4, "Blue", false);
        Rectangle r3 = new Rectangle(3, 4, "Black", true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("r1" + " is " + r1.compareTo(r2) + " to " + "r2");
        System.out.println("r1" + " is " + r1.compareTo(r3) + " to " + "r3");
    }
}
