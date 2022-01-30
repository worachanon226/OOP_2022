import java.util.Scanner;

public class Pro4_64010755 {
    public static void main(String[] args) {
        float w,h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: "); w = input.nextFloat();
        System.out.print("Enter height in inches: "); h = input.nextFloat();
        System.out.format("BMI is %.4f",(w*0.45359237) / (h*0.0254*h*0.0254));
        input.close();
    }
}
