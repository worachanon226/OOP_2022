import java.util.Scanner;

public class Pro3_64010755 {
    public static void main(String[] args) {
        int ans=0;
        String num;
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        
        num = input.nextLine();
        for(int i=0;i<num.length();i++) ans += num.charAt(i)-'0';
        System.out.println("The sum of the digits is " + ans);
        input.close();
    }
}
