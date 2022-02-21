package Pro3_64010755;
import java.util.*;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired = new Date();

    Employee(String name, String address, String phone, String email, String office, double salary){
        super(name,address,phone,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    public String toString(){
        return super.toString() + String.format("\tEmployee{office=%s, dateHired={%s}, salary=%.2f}\n",
                getOffice(), getDateHired(), getSalary());
    }

}
