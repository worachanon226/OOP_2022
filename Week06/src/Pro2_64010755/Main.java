package Pro2_64010755;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("OOP");
        
        course.addStudent("1");
        course.addStudent("2");
        course.addStudent("3");
        
        course.dropStudent("2");
        
        for(int i=0;i<course.getStudentsNumber();i++)
            System.out.println(course.getStudentName(i));
        course.clear();
    }
}
