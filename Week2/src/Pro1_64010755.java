import java.util.Scanner;

public class Pro1_64010755 {
    public static void main(String[] args) {
        int today, nextDay ,futureDay;
        String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        nextDay = input.nextInt();
        futureDay = (today + nextDay) % 7;
        System.out.format("Today is %s and the future day is %s",week[today],week[futureDay]);
        input.close();
    }
}
