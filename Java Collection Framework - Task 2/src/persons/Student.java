package persons;

public class Student extends Person implements Comparable<Person> {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int compareTo(Person o) {
        return getLastName().compareTo(o.getLastName());
    }
}
