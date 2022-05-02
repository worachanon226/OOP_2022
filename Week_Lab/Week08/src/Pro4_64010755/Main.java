package Pro4_64010755;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon(5);

        System.out.println(o1);

        Octagon o2 = o1.clone();

        System.out.println(o2);
        System.out.println("o1 is " + o1.compareTo(o2) + " to o2");
    }
}
