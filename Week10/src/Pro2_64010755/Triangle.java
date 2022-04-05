package Pro2_64010755;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        double[] a = { s1, s2, s3 };
        Arrays.sort(a);
        if (a[0] + a[1] > a[2]) {
            System.out.println("The triangle follows to the rule.");
        } else {
            throw new IllegalTriangleException("The triangle is violate the rule");
        }
    }

    class IllegalTriangleException extends Exception {
        IllegalTriangleException(String s) {
            super(s);
        }
    }
}
