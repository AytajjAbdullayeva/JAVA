public class Student {
    private String fullName;
    private int studentID;
    private int age;
    private double GPA;
    private int enrollmentYear;

    public Student(String name, int id, int studentAge, double studentGPA, int year) {
        fullName = name;
        studentID = id;
        age = studentAge;
        GPA = studentGPA;
        enrollmentYear = year;
    }

    public int EnrolledYear(int currentYear) {
        return currentYear - enrollmentYear;
    }

    public void updateGPA(double newGPA) {
        GPA = newGPA;
        System.out.println("GPA updated to: " + GPA);
    }


    public String displayStudentInfo() {
        return "Student Name: " + fullName + "\n" +
                "Student ID: " + studentID + "\n" +
                "Age: " + age + "\n" +
                "GPA: " + GPA + "\n" +
                "Enrollment Year: " + enrollmentYear;
    }

    public static void main(String[] args) {
        Student student = new Student("Aslanova Aynur", 12345, 19, 3.8, 2023);
        System.out.println(student.displayStudentInfo());
        System.out.println("Student enrolled: " + student.EnrolledYear(2025));
        student.updateGPA(3.9);
    }
}
