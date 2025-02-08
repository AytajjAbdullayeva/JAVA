public class Student {
    private String fullName;
    private int studentID;
    private int age;
    private double GPA;
    private int enrollmentYear;

    public Student(String fullName, int studentID, int age, double GPA, int enrollmentYear) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.age = age;
        this.GPA = GPA;
        this.enrollmentYear = enrollmentYear;
    }

    public int enrolledYear(int currentYear) {
        return currentYear - this.enrollmentYear;
    }

    public void updateGPA(double newGPA) {
        this.GPA = newGPA;
        System.out.println("GPA updated to: " + this.GPA);
    }

    public String displayStudentInfo() {
        return "Student Name: " + this.fullName + "\n" +
                "Student ID: " + this.studentID + "\n" +
                "Age: " + this.age + "\n" +
                "GPA: " + this.GPA + "\n" +
                "Enrollment Year: " + this.enrollmentYear;
    }

    public static void main(String[] args) {
        Student student = new Student("Aslanova Aynur", 12345, 19, 3.8, 2023);
        System.out.println(student.displayStudentInfo());
        System.out.println("Student enrolled: " + student.enrolledYear(2025));
        student.updateGPA(3.9);
    }
}
