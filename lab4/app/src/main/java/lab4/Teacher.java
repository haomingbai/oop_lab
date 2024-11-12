package lab4;

public class Teacher extends Person {
    // Member variables
    private String teacherNo;

    // Constructor
    public Teacher(String id, String name, String phoneNo, String email, String department, String teacherNo) {
        super(id, name, phoneNo, email, department);
        this.teacherNo = teacherNo;
    }

    // Getters
    public String getTeacherNo() {
        return teacherNo;
    }

    // Setters
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }
}
