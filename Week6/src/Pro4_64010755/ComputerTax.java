package Pro4_64010755;
import java.util.Scanner;

public class ComputerTax {

    static double rates[] = {0.10,0.15,0.25,0.28,0.33,0.35};
    static int brackets[][] = {
        {8350,33950,82250,171550,372950},
        {16700,67900,137050,208850,372960},
        {8350,33950,68525,104425,186475},
        {11950,45500,117450,190200,372950}
    };
    static String statuses[] = {"Single filer","Married jointly or qualifying widow(er)","Married separately","Head of household"};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int status;
        double income;
        double tax = 0;

        System.out.println("Filing Status");
        for(int i=0;i<4;i++)
            System.out.format("   [%d]-%s\n",i,statuses[i]);
        
            System.out.print("Enter the filing status: ");
        status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        income = input.nextDouble();

        for(int i=0;i<5;i++){
            if(income<=brackets[status][i]){
                if(i==0){
                    tax = income * rates[i];
                    break;
                }
                else{
                    tax += (income - brackets[status][i-1]) * rates[i];
                    for(int j=i-1;j>0;j--){
                        tax += (brackets[status][j] - brackets[status][j-1]) * rates[j];
                    }
                    tax += brackets[status][0] * rates[0];
                    break;
                }
            }   
        }
        if(income>brackets[status][4]){
            tax += (income - brackets[status][4]) * rates[5];
            for(int j=4;j>0;j--){
                tax += (brackets[status][j] - brackets[status][j-1]) * rates[j];
            }
            tax += brackets[status][0] * rates[0];
        }

        System.out.format("Tax is %.2f",(int)(tax*100)/100.0);

    }
}
