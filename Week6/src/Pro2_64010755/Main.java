package Pro2_64010755;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudent("PuNe");
        course.addStudent("Wor_Chai");
        course.addStudent("PuNe_Wor");
        course.dropStudent("PuNe");
        for(int i=0;i<course.getStudentsNumber();i++)
            System.out.println(course.getStudentName(i));
        course.clear();
    }
}
