package Pro3_64010755;

public class Main {
    public static void main(String[] args) {
        double number[] = new double[1000];
        StopWatch timer = new StopWatch();

        System.out.println("Creating a list containing 1000 elements,");
        
        for(int i=0;i<1000;i++) number[i] = (double) Math.random() * 1000;
        for(int i=0;i<10;i++){
            System.out.format("\t%.2f",number[i]);
            if(i==4) System.out.println();
        } System.out.format("\n\t...\n");
        for(int i=0;i<10;i++){
            System.out.format("\t%.2f",number[i+990]);
            if(i==4) System.out.println();
        }
        System.out.format("\nList created.\n");
        
        System.out.println("Sorting stopwatch starts..."); timer.start();
        selectionSort(number,1000); timer.stop();

        for(int i=0;i<10;i++){
            System.out.format("\t%.2f",number[i]);
            if(i==4) System.out.println();
        } System.out.format("\n\t...\n");
        for(int i=0;i<5;i++){
            System.out.format("\t%.2f",number[i+995]);
            if(i==4) System.out.println();
        }

        System.out.format("Sorting stopwatch stoped.\n");
        System.out.format("The sort time is %.1f milliseconds.\n",timer.getElapsedTime());

        System.out.println("------------------------------------------------------------");
        
        System.out.format("The palindromPrime stopwatch starts...\n"); timer.start();
        System.out.format("Creating 1000 PalindromPrime...\n"); 
        
        int n=1,count=0;
        while(count<100){
            if(palindromeNumCheck(n) && primeNumCheck(n)){
                System.out.format("%d ",n); count++;
                if(count%10==0) System.out.format("\n");
            }
            n++;
        }

        System.out.format("PalindromePrime created.\n"); 
        System.out.format("The palindromPrime stopwatch stoped.\n"); timer.stop();
        System.out.format("The palindromPrime time is %.1f milliseconds.",timer.getElapsedTime());
    }

    private static void selectionSort(double number[],int n){
        for (int i=0;i<n-1;i++){
            int min_idx = i;
            for (int j=i+1;j<n;j++)
            if (number[j] < number[min_idx]) min_idx = j;
            double temp = number[i];
            number[i] = number[min_idx];
            number[min_idx] = temp;
        }
    }

    private static boolean palindromeNumCheck(int number){
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

    private static boolean primeNumCheck(int number){
        if(number==1) return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) return false;
        }
        return true;
    }
}
