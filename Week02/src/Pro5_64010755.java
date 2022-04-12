import java.util.Scanner;

public class Pro5_64010755 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lineNumber = input.nextInt();
        for(int i=1;i<=lineNumber;i++){
            for(int j=i;j<lineNumber;j++) System.out.print("  ");
            for(int j=i;j>=1;j--) System.out.format("%d ",j);
            for(int j=2;j<=i;j++) System.out.format("%d ",j);
            System.out.println();
        }
        input.close();
    }
}
