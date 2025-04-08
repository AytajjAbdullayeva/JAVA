package lesson6;


public class Exam implements Gradable {
    private String examId;
    private String examName;
    private Course course;
    private int maxScore;
    private String examDate;

    public Exam() {
    }

    public Exam(String examId, String examName, Course course, int maxScore, String examDate) {
        this.examId = examId;
        this.examName = examName;
        this.course = course;
        this.maxScore = maxScore;
        this.examDate = examDate;
    }

    @Override
    public void grade(Student student, int score) {

        System.out.println("Graded " + student.getFirstName() + " " + student.getLastName() +
                " for exam " + examName + " with score: " + score + "/" + maxScore);
    }


    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", examName='" + examName + '\'' +
                ", course=" + (course != null ? course.getCourseName() : "None") +
                ", maxScore=" + maxScore +
                ", examDate='" + examDate + '\'' +
                '}';
    }
}