package lab4;

public class Student extends Person {
    // Member variables
    private String studentNo;
    private boolean gender;
    private int grade;

    // Constructor
    /**
     * Constructor
     * 
     * @param id         the id of the student
     * @param name       the name of the student
     * @param phoneNo    the phone number of the student
     * @param email      the email of the student
     * @param department the department of the student
     * @param studentNo  the student number of the student
     * @param gender     the gender of the student where true is female and false is
     *                   male
     * @param grade      the grade of the student
     */
    public Student(String id, String name, String phoneNo, String email, String department, String studentNo,
            boolean gender, int grade) {
        super(id, name, phoneNo, email, department);
        this.studentNo = studentNo;
        this.gender = gender;
        this.grade = grade;
    }

    // Getters
    /**
     * Get the student number
     * 
     * @return The student number
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * Get the gender
     * 
     * @return gender
     */
    public boolean getGender() {
        return gender;
    }

    /**
     * Get the grade
     * 
     * @return grade
     */
    public int getGrade() {
        return grade;
    }

    // Setters
    /**
     * Set the student number
     * 
     * @param studentNo The student number
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    /**
     * Set the gender of the student
     * 
     * @param gender the gender of the student
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Set the grade of the student
     * 
     * @param grade the grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
