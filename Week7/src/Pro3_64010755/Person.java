package Pro3_64010755;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
        this.emailAddress = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getEmail() {
        return this.emailAddress;
    }

    public void setEmail(String email) {
        this.emailAddress = email;
    }

    public String ShowPersonal() {
        return String.format("%s\nName : %s\nAddress : %s\nPhone : %s\nEmail : %s\n",
                getClass().getSimpleName(), getName(),getAddress(), getPhoneNumber(), getEmail());
    }

    public String toString() {
        return ShowPersonal() + String.format("\tPerson{name=%s, address={%s}, phone=%s, email=%s}\n",
                getName(), getAddress(), getPhoneNumber(), getEmail());
    }
}
