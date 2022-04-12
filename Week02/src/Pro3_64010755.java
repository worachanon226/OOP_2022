import java.util.Scanner;

public class Pro3_64010755 {
    public static void main(String[] args) {
        String week[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        Scanner input = new Scanner(System.in);
        int day,month,year;
        int q,m,j,k,h;
        
        System.out.print("Input year: "); year = input.nextInt(); 
        System.out.print("Input month: "); month = input.nextInt();
        System.out.print("Input day of month: "); day = input.nextInt();
        input.close();

        if(month<1 || month>12 || year<1){
            System.out.format("ERROR\n");
            return ;
        }

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            if(day<1 || day>31){
                System.out.format("ERROR\n");
                return ;
            }
        }
        if(month==4 || month==6 || month==9 || month==11){
            if(day<1 || day>30){
                System.out.format("ERROR\n");
                return ;
            }
        }
        if(month==2){
            if((year%4==0 && year%100!=0) || year%400==0){
                if(day<1 || day>29){
                    System.out.format("ERROR\n");
                    return ;
                }
            }
            else if((year%4==0 && year%100==0)  || year%400!=0){
                if(day<1 || day>28){
                    System.out.format("ERROR\n");
                    return ;
                }
            }
        }

        if(month==1 || month==2){
            month += 12;
            year-=1;
        }
        q = day;
        m = month;
        j = year/100;
        k = year%100;
        h = ( q + ((26*(m+1)) / 10) + ( k/4 ) + ( j/4 )+( 5*j ) + k) % 7;
    
        if(month==13 || month==14){
            month -= 12;
            year+=1;
        }
        System.out.format("%d/%d/%d is %s",day,month,year,week[h]);
        return ;
    }
}
