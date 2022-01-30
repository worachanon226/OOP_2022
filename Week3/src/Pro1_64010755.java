import java.lang.Math;

public class Pro1_64010755 {

    public static void main(String[] args) {
        int number=1,count=0;
        while(count<100){
            if(palindromeNumCheck(number) && primeNumCheck(number)){
                System.out.format("%d ",number); count++;
                if(count%10==0) System.out.format("\n");
            }
            number++;
        }
    }

    public static boolean palindromeNumCheck(int number){
        int sum,temp,n,r;
        sum=0; n=number; temp=number;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n/=10;
        }
        if(temp==sum) return true;
        else return false;
    }

    public static boolean primeNumCheck(int number){
        if(number==1) return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) return false;
        }
        return true;
    }
}
