package classroom;

import persons.Student;
import persons.Teacher;

import java.util.ArrayList;
import java.util.Collections;

public class University {

    private ArrayList<String> groupList;
    private ArrayList<Teacher> teacherList;
    private ArrayList<Student> studentList;

    public University() {
        groupList = new ArrayList<>();
        teacherList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    public void addGroup(String groupName, Teacher teacher, ArrayList<Student> students) {
        if (groupName.equals("") || null == teacher || null == students || 0 == students.size() ) {
            throw new IllegalArgumentException("Please init group with right initial data");
        }

        if (!groupList.contains(groupName)) {
            groupList.add(groupName);
        }

        hireTeacher(teacher, groupName);

        for (Student student : students) {
            student.addGroup(groupName);
            if (!studentList.contains(student)) {
                studentList.add(student);
            }
        }
    }

    public void show() {
        System.out.println("\n-------University START------");
        for(String group: groupList) {
            showGroup(group);
        }
        System.out.println("-------University END------\n");
    }

    public void showGroup(String groupName) {
        if (!hasAGroup(groupName)) {
            System.out.format("\nCant find group by name `%s`", groupName);
        }

        ArrayList<Student> students = getGroupStudents(groupName);
        Collections.sort(students);

        Teacher teacher = getGroupTeacher(groupName);
        String teacherName = (null != teacher) ? teacher.toString() : "Free Position";


        System.out.format("\nGroup %s: teacher: %s, students : %s\n", groupName, teacherName, students);
    }

    public Teacher getGroupTeacher(String groupName) {

        for(Teacher teacher : teacherList) {
            if (teacher.existInGroup(groupName)) {
                return  teacher;
            }
        }

        return null;
    }

    public ArrayList<Student> getGroupStudents(String groupName) {

        ArrayList<Student> students = new ArrayList<>();
        for(Student student : studentList) {
            if (student.existInGroup(groupName)) {
                if (!students.contains(student)) {
                    students.add(student);
                }
            }
        }

        return students;
    }

    public boolean hasAGroup(String groupName) {
        return groupList.contains(groupName);
    }

    public void hireTeacher(Teacher teacher, String groupName) {
        teacher.addGroup(groupName);
        if (!teacherList.contains(teacher)) {
            teacherList.add(teacher);
        }
    }

    public void fireTeacher(Teacher teacher) {
        teacher.fire();
        if (teacherList.contains(teacher)) {
            teacherList.remove(teacher);
        }
    }

    public void showStudentsThatHaveMoreThanOneTeacher() {
        ArrayList<Student> students = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getGroupCount() > 1) {
                students.add(student);
            }
        }

        if (students.size() == 0) {
            System.out.println("The university hasn't students that have more than one teacher");
        } else {
            System.out.format("\nStudents that have more than one teacher: %s\n", students);
        }

    }

    public void showTeachersThatHaveCommonStudents() {
        ArrayList<Teacher> teachers = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getGroupCount() > 1) {
                ArrayList<String> groupList = student.getGroupNameList();
                for (String group : groupList) {
                    Teacher teacher = getGroupTeacher(group);
                    if (null != teacher && !teachers.contains(teacher)) {
                        teachers.add(teacher);
                    }
                }
            }
        }

        if (teachers.size() == 0) {
            System.out.println("The university hasn't teachers that have more than one teacher");
        } else {
            System.out.format("\nteachers that have common students: %s\n", teachers);
        }


    }
}
