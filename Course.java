public class Course {
private String code;
private String title;
private int capacity;

public Course(String code, String title, int capacity) {
    this.code = code;
    this.title = title;
    this.capacity = capacity;
}

public String getCode() {
    return code;
}

public String getTitle() {
    return title;
}

public int getCapacity() {
    return capacity;
}

}

RegistrationSystem.java

import java.util.ArrayList;
import java.util.HashMap;

public class RegistrationSystem {

private ArrayList<Student> students = new ArrayList<>();
private ArrayList<Course> courses = new ArrayList<>();

private HashMap<String, ArrayList<String>> registrations
        = new HashMap<>();

public void addStudent(Student s) {
    students.add(s);
}

public void addCourse(Course c) {
    courses.add(c);
}

public void registerCourse(String studentId,
                           String courseCode) {

    registrations.putIfAbsent(
            studentId,
            new ArrayList<>());

    registrations.get(studentId)
            .add(courseCode);
}

public void showRegistrations() {

    for (String studentId :
            registrations.keySet()) {

        System.out.println(
                studentId + " -> "
                + registrations.get(studentId));
    }
}
