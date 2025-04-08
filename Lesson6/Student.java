package lesson6;



import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    private int studentId;
    private String department;
    private int yearOfStudy;
    private List<Course> enrolledCourses;
    private List<Exam> exams;

    public Student() {
        this.enrolledCourses = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    public Student(String firstName, String lastName, int age, String gender, String email,
                   int studentId, String department, int yearOfStudy) {
        super(firstName, lastName, age, gender, email);
        this.studentId = studentId;
        this.department = department;
        this.yearOfStudy = yearOfStudy;
        this.enrolledCourses = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void takeExam(Exam exam) {
        exams.add(exam);
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", studentId=" + studentId +
                ", department='" + department + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", enrolledCourses=" + enrolledCourses.size() +
                ", exams=" + exams.size() +
                '}';
    }
}