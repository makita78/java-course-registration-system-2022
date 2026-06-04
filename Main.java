public class Main {

public static void main(String[] args) {

    RegistrationSystem system =
            new RegistrationSystem();

    Student s1 =
            new Student("2022001",
                        "Makita Islam Mim");

    Course c1 =
            new Course("CS101",
                       "Algorithms",
                       30);

    system.addStudent(s1);
    system.addCourse(c1);

    system.registerCourse(
            "2022001",
            "CS101");

    system.showRegistrations();
}

}
