package persons;

import java.util.ArrayList;

public class Teacher extends Person {

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void fire() {
        groupNameList = new ArrayList<>();
    }
}
