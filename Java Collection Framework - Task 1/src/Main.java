
public class Main {

    public static void main (String[] args) {

        Person person1 = new Person("Ender", "Wiggin", 1122, "555-1111");
        Person person2 = new Person("Maria",  "Macarena", 7788, "555-2222");
        Person person3 = new Person("Harry", "Potter",	9955, "555-3333");
        Person person4 = new Person("Honor", "Harrington", 8888, "555-4444");
        Person person5 = new Person("R.Daneel", "Olivaw",  5555, "555-5555");
        Person person6 = new Person("Peter", "Parker", 1234, "555-6666");

        PersonTestData personsData = new PersonTestData();
        personsData.show();
        personsData.addPerson(person1);
        personsData.addPerson(person2);
        personsData.addPerson(person3);
        personsData.addPerson(person4);
        personsData.addPerson(person5);
        personsData.addPerson(person6);
        personsData.addPerson(person1);
        personsData.show();

        // a. Show the record of a person whose name is: Macarena.
        personsData.findPerson(person2.getLastName());

        // b. Repeat the experience locating a person whose last name is: Potter
        personsData.findPerson("Potter");

        // c. Retrieve from the arraylist the person whose idNumber is 1234;
        personsData.removerPersonVariant1(1234);
        personsData.removerPersonVariant2(1234);

        personsData.show();
    }
}
