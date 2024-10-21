package cn.edu.nwpu.unit;

/**
 * The Teacher class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class Teacher extends User {
    // Members
    private String teacherNo;
    private String department;

    // Constructors
    /**
     * The default constructor
     * 
     * @param id         The id of the teacher
     * @param name       The name of the teacher
     * @param phoneNo    The phone number of the teacher
     * @param email      The email of the teacher
     * @param teacherNo  The teacher number of the teacher
     * @param department The department of the teacher
     */
    public Teacher(String id, String name, String phoneNo, String email, String teacherNo, String department) {
        super(id, name, phoneNo, email);
        this.teacherNo = new String(teacherNo);
        this.department = new String(department);
    }

    /**
     * The constructor of the teacher
     * 
     * @param teacherNo  The teacher number of the teacher
     * @param id         The id of the teacher
     * @param name       The name of the teachear
     * @param phoneNo    The phone number of the teacher
     * @param email      The email of the teacher
     */
    public Teacher(String id, String name, String phoneNo, String email, String teacherNo) {
        super(id, name, phoneNo, email);
        this.teacherNo = new String(teacherNo);
        this.department = new String("");
    }

    /**
     * Copy constructor
     * 
     * @param teacher The teacher to be copied
     */
    public Teacher(Teacher teacher) {
        super(teacher);
        this.teacherNo = new String(teacher.teacherNo);
        this.department = new String(teacher.department);
    }

    // Methods
    /**
     * Get the teacher number of the teacher
     * 
     * @return The teacher number of the teacher
     */
    public String getTeacherNo() {
        return new String(teacherNo);
    }

    /**
     * Get the department of the teacher
     * 
     * @return The department of the teacher
     */
    public String getDepartment() {
        return new String(department);
    }

    /**
     * Set the department of a teacher
     * 
     * @param department The department of the teacher
     */
    public void setDepartment(String department) {
        this.department = new String(department);
    }

    /**
     * Convert the teacher to a string
     * 
     * @return The string of the teacher
     */
    public String toString() {
        String info = super.toString();
        info += "_" + teacherNo + "_" + department;
        return info;
    }
}
