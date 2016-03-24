package persons;

import java.util.ArrayList;

public abstract class Person {
    private String firstName;
    private String lastName;
    protected ArrayList<String> groupNameList;

    public Person(String firstName, String lastName) {
        if (firstName.equals("") || lastName.equals("")) {
            throw new IllegalArgumentException("Personal data  can't be empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        groupNameList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getGroupNameList() {
        return groupNameList;
    }

    @Override
    public String toString() {
        return firstName + "\t" + lastName;
    }

    public void addGroup(String groupName) {
        if (groupNameList.contains(groupName)) {
            System.out.format("Person already exist in group `s`", groupName);
            return;
        }
        groupNameList.add(groupName);
    }

    public void deleteGroup(String groupName) {
        if (groupNameList.contains(groupName)) {
            groupNameList.remove(groupName);
            return;
        }
        System.out.format("Person doesn't exist in group `s`", groupName);
    }

    public boolean existInGroup(String groupName) {
        for (String group : groupNameList) {
            if (group == groupName) {
                return true;
            }
        }

        return false;
    }

    public int getGroupCount () {
        return  groupNameList.size();
    }

}
