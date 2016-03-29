import classroom.University;
import persons.Student;
import persons.Teacher;

import java.util.ArrayList;

public class Main {

    private static final String GROUP_1_NAME = "group1Name";
    private static final String GROUP_2_NAME = "group2Name";
    private static final String GROUP_3_NAME = "group3Name";
    private static final String GROUP_4_NAME = "group4Name";

    public static void main(String[] args) {

        Teacher teacherBertieHansel = new Teacher("Bertie", "Hansel");
        Teacher teacherJamesMcCoy = new Teacher("James", "McCoy");
        Teacher teacherAnastaciaBrooklyn = new Teacher("Anastacia", "Brooklyn");
        Teacher teacherJimKerry = new Teacher("Jim", "Kerry");

        Student studentHovoHovoyan = new Student("Hovo", "Hovoyan");
        Student studentMkoMkoyan = new Student("Mko", "Mkoyan");
        Student studentDmboDmboyan = new Student("Dmbo", "Dmboyan");
        Student studentParandzemParandzemyan = new Student("Parandzem", "Parandzemyan");
        Student studentVarsikVarsikyan = new Student("Varsik", "Varsikyan");
        Student studentVasilVasilya = new Student("Vasil", "Vasilya");
        Student studentSaqoSagoyan = new Student("Sago", "Sagoyan");
        Student studentKarapetKarapetyan = new Student("Karapet", "Karaptyan");
        Student studentCactusCactusyan = new Student("Cactus", "Cactusyan");
        Student studentTaguhiTaguhyan = new Student("Taguhi", "Taguhyan");
        Student studentHarisaHarisyan = new Student("Harisa", "Harisyan");

        ArrayList<Student> class1Students = new ArrayList<>();
        class1Students.add(studentHovoHovoyan);
        class1Students.add(studentMkoMkoyan);
        class1Students.add(studentDmboDmboyan);
        class1Students.add(studentParandzemParandzemyan);
        class1Students.add(studentVarsikVarsikyan);

        ArrayList<Student> class2Students = new ArrayList<>();
        class2Students.add(studentVasilVasilya);
        class2Students.add(studentSaqoSagoyan);
        class2Students.add(studentKarapetKarapetyan);

        ArrayList<Student> class3Students = new ArrayList<>();
        class3Students.add(studentHovoHovoyan);
        class3Students.add(studentSaqoSagoyan);
        class3Students.add(studentCactusCactusyan);
        class3Students.add(studentTaguhiTaguhyan);

        ArrayList<Student> class4Students = new ArrayList<>();
        class4Students.add(studentParandzemParandzemyan);
        class4Students.add(studentTaguhiTaguhyan);
        class4Students.add(studentHarisaHarisyan);

        University university = new University();

        university.addGroup(GROUP_1_NAME, teacherBertieHansel, class1Students);
        university.addGroup(GROUP_2_NAME, teacherJamesMcCoy, class2Students);
        university.addGroup(GROUP_3_NAME, teacherAnastaciaBrooklyn, class3Students);
        university.addGroup(GROUP_4_NAME, teacherJimKerry, class4Students);

        // Task a. Find teachers that have common students.
        university.showTeachersThatHaveCommonStudents();

        // Task b. Scenario: Jim Kerry got fired for bad behaviour during the classes. A new teacher is hired in place of him. Please update your data structure to reflect it.
        Teacher newTeacher = new Teacher("Jim ", "Kerry Replacer");
        university.fireTeacher(teacherJimKerry);
        university.showGroup(GROUP_4_NAME);
        university.hireTeacher(newTeacher, GROUP_4_NAME);
        university.showGroup(GROUP_4_NAME);

        // Task 3. print on the screen teachers and their students sorted by their names in the format "teacher: strudent1, student2,..."
        university.show();

        // Task4. Print on the screen all the students that have more than one teacher.
        university.showStudentsThatHaveMoreThanOneTeacher();


    }
}
