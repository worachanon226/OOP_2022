public class Pro2 {
    public static void main(String[] args) {

        Course course = new Course("OOP");
        
        course.addStudent("1");
        course.addStudent("2");
        course.addStudent("3");

        for(int i=0;i<course.getStudentsNumber();i++)
            System.out.println(course.getStudentName(i));
        
        course.dropStudent("4");
        
        for(int i=0;i<course.getStudentsNumber();i++)
            System.out.println(course.getStudentName(i));

        course.clear();

        for(int i=0;i<course.getStudentsNumber();i++)
            System.out.println(course.getStudentName(i));
    }
}
