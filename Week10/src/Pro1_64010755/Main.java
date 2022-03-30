package Pro1_64010755;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static int[] a = genArray();

    public static void main(String[] args) {

        System.out.print("Enter the index : ");

        try {
            System.out.println("Value : " + a[input.nextInt()]);
        } catch (Exception e) {
            System.out.println("Out of Bounds.");
        }
    }

    private static int[] genArray() {
        int a[] = new int[100];

        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
        }
        return a;
    }
}
