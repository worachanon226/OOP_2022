import java.util.Arrays;
import java.util.Scanner;

public class Pro2_64010755 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputList1,inputList2;
        String[] splitList1,splitList2;
        
        System.out.print("Enter list1: "); inputList1 = input.nextLine();
        System.out.print("Enter list2: "); inputList2 = input.nextLine();
        input.close();
      
        if(inputList1.isEmpty() && inputList2.isEmpty()){
            System.out.print("There isn't a number on any of the lists.");
            return ;
        }
        
        splitList1 = inputList1.split(" ");
        splitList2 = inputList2.split(" ");

        int[] list1 = new int[splitList1.length];
        int[] list2 = new int[splitList2.length];

        if(inputList1.isEmpty()) list1 = new int[0];
        else for(int i=0;i<splitList1.length;i++) list1[i] = Integer.parseInt(splitList1[i]);

        if(inputList2.isEmpty()) list2 = new int[0];
        else for(int i=0;i<splitList2.length;i++) list2[i] = Integer.parseInt(splitList2[i]);

        int[] mergeList = merge(list1,list2);
        System.out.print("The merged list is ");
        for(int i=0;i<mergeList.length;i++) System.out.format("%d ",mergeList[i]);
    }

    public static int[] merge(int[] list1,int[] list2){

        int[] mergeList = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, mergeList, 0, list1.length);
        System.arraycopy(list2, 0, mergeList, list1.length, list2.length);

        Arrays.sort(mergeList);

        return mergeList;
    }
}
