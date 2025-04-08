package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private int creditHours;
    private String description;
    private Teacher instructor;
    private List<Student> enrolledStudents;
    private List<Exam> exams;

    public Course() {
        this.enrolledStudents = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    public Course(String courseId, String courseName, int creditHours, String description) {
        this();
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.description = description;
    }


    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCreditHours() { return creditHours; }
    public void setCreditHours(int creditHours) { this.creditHours = creditHours; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Teacher getInstructor() { return instructor; }
    public void setInstructor(Teacher instructor) { this.instructor = instructor; }

    public List<Student> getEnrolledStudents() { return enrolledStudents; }
    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public List<Exam> getExams() { return exams; }
    public void setExams(List<Exam> exams) { this.exams = exams; }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    public void conductExam(Exam exam) {
        exams.add(exam);
        for (Student student : enrolledStudents) {
            student.takeExam(exam);
        }
    }
}
