import java.util.Arrays;
import java.util.Scanner;

public class Pro4_64010755 {
    public static void main(String[] args) {
        String[] country = new String[3];
        String[] ordinal = {"first","second","third"};
        Scanner input = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.format("Enter the %s city: ",ordinal[i]);
            country[i] = input.nextLine();
        }
        Arrays.sort(country);
        System.out.print("The three cities in alphabetical order are ");
        for(int i=0;i<3;i++) System.out.format("%s ",country[i]);
        input.close();
    }
}
