import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonTestData {

    private ArrayList<Person> personList;
    private Map<String, Person> personMapWithNameKey;
    private Map<Integer, Person> personMapWithIdKey;

    public PersonTestData() {
        personList = new ArrayList<>();
        personMapWithNameKey = new HashMap<>();
        personMapWithIdKey = new HashMap<>();
    }

    public void show() {
        System.out.println("\n-----------------------------------");
        if (personList.size() == 0) {
            System.out.println("Can't find ani person in data");
        }
        for(Person person : personList) {
            System.out.format("Person info `%s`\n", person);
        }
        System.out.println("-----------------------------------\n");
    }

    public void addPerson(Person person) {
        if (-1 != personList.indexOf(person)) {
            System.out.format("Person `%s` already exist in data\n", person);
            return;
        }
        personList.add(person);
        personMapWithNameKey.put(person.getLastName(), person);
        personMapWithIdKey.put(person.getIdNumber(), person);
    }

    public void removerPersonVariant1(int idNumber) {
        Person person = findPerson(idNumber);
        if (null == person) {
            System.out.format("Can't find Person with %s id Number in data \n", idNumber);
            return;
        }

        if (personList.contains(person)) {
            personList.remove(person);
            System.out.format("Person `%s` removed from data\n", person);
        } else {
            System.out.format("Can't find Person `%s` in data\n", person);
        }
    }

    public void removerPersonVariant2(int idNumber) {
        for(Person person : personList) {
            if (person.getIdNumber() == idNumber) {
                personList.remove(person);
                System.out.format("Person `%s` removed from data\n", person);
                return;
            }
        }
        System.out.format("Can't find Person with %s id Number in data\n", idNumber);
    }

    public void addPersons(ArrayList<Person> persons) {
        for(Person person : persons) {
            addPerson(person);
        }
    }

    public void findPerson(Person person) {
        if (personList.contains(person)) {
            System.out.format("Search Result For Person `%s` \n", person);
        } else {
            System.out.format("Can't find Person `%s` in data\n", person);
        }
    }

    public Person findPerson(int idNumber) {
        if (personMapWithIdKey.containsKey(idNumber)) {
            System.out.format("Search Result with %s id Number Person `%s` \n", idNumber, personMapWithIdKey.get(idNumber));
            return personMapWithIdKey.get(idNumber);
        }

        System.out.format("Can't find Person with %s id Number in data \n", idNumber);
        return null;
    }

    public void findPerson(String lastName) {
        if (personMapWithNameKey.containsKey(lastName)) {
            System.out.format("Search Result with %s last name Person `%s` \n", lastName, personMapWithNameKey.get(lastName));
        } else {
            System.out.format("Can't find Person with %s last name in data \n", lastName);
        }
    }
}
