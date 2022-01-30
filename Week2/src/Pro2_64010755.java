import java.util.Random;
import java.util.Scanner;

public class Pro2_64010755 {
    public static void main(String[] args) {
        String action[] = {"scissor","rock","paper"};
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int comAction,playerAction;
        int isPlayerWon; // -1 = Lose / 0 = Draw / 1 = Win
        
        comAction = rand.nextInt(3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        playerAction = input.nextInt();

        if(comAction == playerAction) isPlayerWon = 0;
        else if(comAction==0 && playerAction==1 || 
                comAction==1 && playerAction==2 || 
                comAction==2 && playerAction==0) isPlayerWon = 1;
        else isPlayerWon = -1;

        if(isPlayerWon==1) System.out.format("The computer is %s. You are %s. You won",action[comAction],action[playerAction]);
        if(isPlayerWon==-1) System.out.format("The computer is %s. You are %s. You lose",action[comAction],action[playerAction]);
        if(isPlayerWon==0) System.out.format("The computer is %s. You are %s too. It is a draw",action[comAction],action[playerAction]);
        input.close();
    }
}
