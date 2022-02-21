package Pro3_64010755;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + String.format("\tStaff{title=%s}\n", this.getTitle());
    }
}
