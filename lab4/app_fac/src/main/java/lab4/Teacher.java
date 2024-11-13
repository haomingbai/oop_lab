package lab4;

public class Teacher extends Person {
    // Member variables
    private String teacherNo;

    // Constructor
    /**
     * Constructor
     * 
     * @param id         the id of the teacher
     * @param name       the name of the teacher
     * @param phoneNo    the phone number of the teacher
     * @param email      the email of the teacher
     * @param department the department of the teacher
     * @param teacherNo  the teacher number of the teacher
     */
    public Teacher(String id, String name, String phoneNo, String email, String department, String teacherNo) {
        super(id, name, phoneNo, email, department);
        this.teacherNo = teacherNo;
    }

    // Getters
    /**
     * Get the teacher number
     * 
     * @return The teacher number
     */
    public String getTeacherNo() {
        return teacherNo;
    }

    // Setters
    /**
     * Set the teacher number
     * 
     * @param teacherNo The teacher number
     */
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }
}
