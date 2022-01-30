
import java.util.Random;
import java.util.Scanner;

public class Pro3_64010755{
    
    static int matrixSize;
    static int[][] matrix;
    
    public static void main(String[] args) {
        matrix = generateMatrix();
        checkAllRow();
        checkAllColumn();
        
        if(matrixSize >= 2) checkSubdiagonal();
        if(matrixSize >= 1) checkDiagonal();
        if(matrixSize >= 2) checkSuperdiagonal();
    }

    public static void checkSubdiagonal(){
        boolean chSubdiagonal = false;
        if(matrixSize==1) return;
        for(int k=0;k<2;k++){
            boolean ch=true;
            for(int i=1,j=0;i<matrixSize;i++,j++){
                if(matrix[i][j]!=k){
                    ch = false;
                    break;
                }
            }
            if(ch==true){
                System.out.format("All %ds on subdiagonal\n",k);
                chSubdiagonal = true;
            }
        }
        if(chSubdiagonal==false) System.out.println("No same numbers on the subdiagonal");
    }

    public static void checkSuperdiagonal(){
        boolean chSuperdiagonal = false;
        if(matrixSize==1) return;
        for(int k=0;k<2;k++){
            boolean ch=true;
            for(int i=0,j=1;i<matrixSize-1;i++,j++){
                if(matrix[i][j]!=k){
                    ch = false;
                    break;
                }
            }
            if(ch==true){
                System.out.format("All %ds on superdiagonal\n",k);
                chSuperdiagonal = true;
            }
        }
        if(chSuperdiagonal==false) System.out.println("No same numbers on the superdiagonal");
    }

    public static void checkDiagonal(){
        boolean chDiagonal = false;
        for(int k=0;k<2;k++){
            boolean ch=true;
            for(int i=0;i<matrixSize;i++){
                if(matrix[i][i]!=k){
                    ch = false;
                    break;
                }
            }
            if(ch==true){
                System.out.format("All %ds on diagonal\n",k);
                chDiagonal = true;
            }
        }
        if(chDiagonal==false) System.out.println("No same numbers on the diagonal");
    }

    public static void checkAllColumn(){
        boolean chAllColumn = false;
        for(int k=0;k<2;k++){
            for(int j=0;j<matrixSize;j++){
                boolean ch=true;
                for(int i=0;i<matrixSize;i++){
                    if(matrix[i][j]!=k){
                        ch=false;
                        break;
                    } 
                }
                if(ch){
                    chAllColumn = true;
                    System.out.format("All %ds on colomn %d\n",k,j);
                }
            }
        }
        if(!chAllColumn) System.out.println("No same numbers on a column");
    }

    public static void checkAllRow(){
        boolean chAllRow = false;
        for(int k=0;k<2;k++){
            for(int i=0;i<matrixSize;i++){
                boolean ch=true;
                for(int j=0;j<matrixSize;j++){
                    if(matrix[i][j]!=k){
                        ch=false;
                        break;
                    } 
                }
                if(ch){
                    System.out.format("All %ds on row %d\n",k,i);
                    chAllRow = true;
                }
            }
        }
        if(!chAllRow) System.out.println("No same numbers on a row");
    }

    public static int[][] generateMatrix(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the size for the matrix: ");
        matrixSize = input.nextInt();
        input.close();
        if(matrixSize <= 0){
            System.out.println("Error, Please enter the matrix size that greater than zero.");
            System.exit(0);
        }
        int matrix[][] = new int[matrixSize][matrixSize];

        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                matrix[i][j] = rand.nextInt(2);
                System.out.print(matrix[i][j]);
            } System.out.println();
        }
        
        return matrix;
    }
}