package Pro3_64010755;

public class Student extends Person {
    private String STATUS[] = {"Freshman", "Sophomore", "Junior", "Senior"};
    private int status = 0;

    Student(){}

    Student(String name,String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getStatus(){
        return STATUS[this.status];
    }

    public String toString(){
        return super.toString() + String.format("\tStudent{status=%s}\n", this.getStatus());
    }
}
