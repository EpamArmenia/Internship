public class Person {
    private String firstName;
    private String lastName;
    private int idNumber;
    private String phoneNumber;

    public Person (String firstName, String lastName, int idNumber) {
        this(firstName, lastName, idNumber, "");
    }

    public Person (String firstName, String lastName, int idNumber, String phoneNumber) {
        if (firstName.equals("") || lastName.equals("") || 0 >= idNumber) {
            throw new IllegalArgumentException("Personal data  can't be empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t" + idNumber + "\t" + phoneNumber;
    }
}
