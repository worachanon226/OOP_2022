package Pro3_64010755;

import java.io.*;

public class Main {

    static String[] rr = { "assistant", "associate", "full" };

    public static void main(String[] args) throws FileNotFoundException {

        double salary;
        String rank;
        File file = new File("Salary.txt");

        try (PrintWriter output = new PrintWriter(file);) {

            for (int i = 0; i < 1000; i++) {
                rank = genRank();
                salary = genSalary(rank);

                output.format("FirstName%d LastName%d ", i + 1, i + 1);
                output.println(rank + " " + salary);
            }
        }

    }

    private static double genSalary(String r) {
        int ch = 0;
        for (int i = 0; i < 3; i++) {
            if (rr[i] == r) {
                ch = i;
                break;
            }
        }
        if (ch == 0)
            return 50000 + (double) (Math.random() * 30001);
        else if (ch == 1)
            return 60000 + (double) (Math.random() * 50001);
        else
            return 75000 + (double) (Math.random() * 55001);
    }

    private static String genRank() {
        String r;

        r = rr[(int) (Math.random() * 3)];
        return r;
    }
}
