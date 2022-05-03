public class Course {
    private int students_num = 0;
    private String courseName;
    private String[] students = new String[students_num];

    public Course(String name){
        this.courseName = name;
    }

    public void addStudent(String name){
        String[] temp = new String[students_num];
        temp = students;
        students_num++;
        students = new String[students_num];
        students[students_num - 1] = name;
        System.arraycopy(temp, 0, students, 0, students_num-1);
    }

    public void dropStudent(String name){
        for(int i=0;i<students_num;i++){
            if(name==students[i]){
                System.arraycopy(students, i+1, students, i, students_num-(i+1));
                students_num--;
                students[students_num] = "\0";
            }
        }
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getStudentName(int i){
        return students[i];
    }

    public int getStudentsNumber(){
        return students_num;
    }

    public void clear(){
        students_num = 0;
        students = new String[students_num];
    }
}
