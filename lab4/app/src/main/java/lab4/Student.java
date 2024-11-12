package lab4;

public class Student extends Person {
    // Member variables
    private String studentNo;
    private boolean gender;
    private int grade;

    // Constructor
    public Student(String id, String name, String phoneNo, String email, String department, String studentNo,
            boolean gender, int grade) {
        super(id, name, phoneNo, email, department);
        this.studentNo = studentNo;
        this.gender = gender;
        this.grade = grade;
    }

    // Getters
    public String getStudentNo() {
        return studentNo;
    }

    public boolean getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
