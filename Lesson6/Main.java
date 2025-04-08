package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

public class Main {
    private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ali", "Aliyev", 20, "Male", "ali@edu.az", 1001, "Computer Science", 2),
                new Student("Aysel", "Mammadova", 21, "Female", "aysel@edu.az", 1002, "Engineering", 3),
                new Student("Kamran", "Hasanov", 19, "Male", "kamran@edu.az", 1003, "Mathematics", 1),
                new Student("Leyla", "Rzayeva", 22, "Female", "leyla@edu.az", 1004, "Physics", 4),
                new Student("Orkhan", "Ismayilov", 20, "Male", "orkhan@edu.az", 1005, "Computer Science", 2)
        };


        Teacher[] teachers = {
                new Teacher("Professor", "Muradov", 45, "Male", "muradov@edu.az", 2001, "Computer Science", 15, "PhD"),
                new Teacher("Dr.", "Guliyeva", 38, "Female", "guliyeva@edu.az", 2002, "Mathematics", 10, "PhD")
        };


        Course[] courses = {
                new Course("CS101", "Java Programming", 4, "Core Java concepts"),
                new Course("CS201", "Algorithms", 3, "Data Structures & Algorithms"),
                new Course("MATH101", "Calculus", 4, "Differential Calculus"),
                new Course("PHYS101", "Physics", 3, "Mechanics and Thermodynamics")
        };


        teachers[0].teachCourse(courses[0]);
        teachers[0].teachCourse(courses[1]);
        teachers[1].teachCourse(courses[2]);
        teachers[1].teachCourse(courses[3]);


        enrollStudents(students, courses);


        Exam[] exams = createExams(courses);


        saveAllData(students, teachers, courses, exams);
    }

    private static void enrollStudents(Student[] students, Course[] courses) {

        students[0].enrollInCourse(courses[0]);
        students[0].enrollInCourse(courses[2]);

        students[1].enrollInCourse(courses[1]);
        students[1].enrollInCourse(courses[3]);

        students[2].enrollInCourse(courses[0]);
        students[2].enrollInCourse(courses[2]);

        students[3].enrollInCourse(courses[1]);
        students[3].enrollInCourse(courses[3]);

        students[4].enrollInCourse(courses[0]);
        students[4].enrollInCourse(courses[1]);
    }

    private static Exam[] createExams(Course[] courses) {
        return new Exam[]{
                new Exam("JAVA-MID", "Java Midterm", courses[0], 100, "2023-10-15"),
                new Exam("ALGO-FIN", "Algorithms Final", courses[1], 100, "2023-12-20"),
                new Exam("CALC-MID", "Calculus Midterm", courses[2], 100, "2023-11-05"),
                new Exam("PHYS-FIN", "Physics Final", courses[3], 100, "2023-12-15")
        };
    }

    private static void saveAllData(Student[] students, Teacher[] teachers,
                                    Course[] courses, Exam[] exams) {
        try {
            objectMapper.writeValue(new File("students.json"), students);
            objectMapper.writeValue(new File("teachers.json"), teachers);
            objectMapper.writeValue(new File("courses.json"), courses);
            objectMapper.writeValue(new File("exams.json"), exams);
            System.out.println("All data saved successfully!");
        } catch (IOException e) {
            System.err.println("Error saving files: " + e.getMessage());
        }
    }
}