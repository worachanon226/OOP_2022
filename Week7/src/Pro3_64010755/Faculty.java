package Pro3_64010755;

public class Faculty extends Employee {
    private int officeHours;
    private String rank;
    
    public Faculty(String name, String address, String phone, String email, String office, double salary,int officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(int hours) {
        this.officeHours = hours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + String.format("\tFaculty{officeHours=%.2f, rank=%s}\n",
                this.getOfficeHours(), this.getRank());
    }
}
