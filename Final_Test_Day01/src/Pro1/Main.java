package Pro1;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
        String s1 = input.nextLine();

        System.out.print("Enter list2: ");
        String s2 = input.nextLine();

        input.close();

        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");

        int[] list1 = new int[ss1.length];
        int[] list2 = new int[ss2.length];

        for(int i=0;i<ss1.length;i++){
            list1[i] = Integer.parseInt(ss1[i]);
        }
        for(int i=0;i<ss2.length;i++){
            list2[i] = Integer.parseInt(ss2[i]);
        }

        int[] mergeList = new int[list1.length + list2.length];
        mergeList = merge(list1,list2);

        for(int i=0;i<mergeList.length;i++)
            System.out.format("%d ",mergeList[i]);
    }

    public static int[] merge(int[] list1, int[] list2){
        
        int[] mergeList = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, mergeList, 0, list1.length);
        System.arraycopy(list2, 0, mergeList, list1.length, list2.length);

        Arrays.sort(mergeList);
        return mergeList;
    }
}