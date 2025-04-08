package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human implements Teachable {
    private int teacherId;
    private String specialization;
    private int yearsOfExperience;
    private String degree;
    private List<Course> teachingCourses;

    public Teacher() {
        this.teachingCourses = new ArrayList<>();
    }

    public Teacher(String firstName, String lastName, int age, String gender, String email,
                   int teacherId, String specialization, int yearsOfExperience, String degree) {
        super(firstName, lastName, age, gender, email);
        this.teacherId = teacherId;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.degree = degree;
        this.teachingCourses = new ArrayList<>();
    }

    @Override
    public void teachCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setInstructor(this);
        }
    }

    public int getTeacherId() { return teacherId; }
    public void setTeacherId(int teacherId) { this.teacherId = teacherId; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public List<Course> getTeachingCourses() { return teachingCourses; }
    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }
}