package Pro4_64010755;

import java.io.*;
import java.util.*;

public class Main {

    static Vector<Double> assistant = new Vector<Double>();
    static Vector<Double> associate = new Vector<Double>();
    static Vector<Double> full = new Vector<Double>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String[] s = (input.nextLine()).split(" ");
            separate(s[2], Double.parseDouble(s[3]));
        }
        input.close();

        Double assiSum = sum(assistant);
        Double assoSum = sum(associate);
        Double fullSum = sum(full);
        Double all = assiSum + assoSum + fullSum;

        System.out.printf("Assistant : $%.2f\n", assiSum);
        System.out.printf("Associate : $%.2f\n", assoSum);
        System.out.printf("Full :      $%.2f\n", fullSum);
        System.out.printf("All :       $%.2f\n", all);

        System.out.printf("Assistant Average: $%.2f\n",
                (assiSum / assistant.size()));
        System.out.printf("Associate Average: $%.2f\n",
                (assoSum / associate.size()));
        System.out.printf("Full Average:      $%.2f\n",
                (fullSum / full.size()));
        System.out.printf("All Average:       $%.2f\n",
                (all / (assistant.size() + associate.size() + full.size())));
    }

    private static double sum(Vector<Double> v) {
        double sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }

        return sum;
    }

    private static void separate(String r, Double s) {
        if (r.equals("assistant")) {
            assistant.add(s);
        } else if (r.equals("associate")) {
            associate.add(s);
        } else {
            full.add(s);
        }
    }
}
