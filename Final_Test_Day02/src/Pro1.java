public class Pro1{

    static char[][] studentAnswer= {{'A','B','A','C','C','D','E','E','A','D'}, //0
                                    {'D','B','A','B','C','A','E','E','A','D'}, //1
                                    {'E','D','D','A','C','B','E','E','A','D'}, //2
                                    {'C','B','A','E','D','C','E','E','A','D'}, //3
                                    {'A','B','D','C','C','D','E','E','A','D'}, //4
                                    {'B','B','E','C','C','D','E','E','A','D'}, //5
                                    {'B','B','A','C','C','D','E','E','A','D'}, //6
                                    {'B','B','E','C','C','D','E','E','A','D'}, //7
                                   };

    static char[] answer = {'D','D','D','C','C','D','A','E','A','D'};
    static int[] studentCount = new int[8];

    public static void main(String[] args) {

        for(int i=0;i<8;i++){
            for(int j=0;j<10;j++){
               if(studentAnswer[i][j]==answer[j]){
                   studentCount[i]++;
               }
            }

        }
        for(int i=0;i<8;i++){
            System.out.print("Student "+ i +"\'s correct count is ");
            System.out.println(studentCount[i]);
        }

    }
}