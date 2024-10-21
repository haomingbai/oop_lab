package cn.edu.nwpu.unit;

import java.util.List;
import java.util.ArrayList;

/**
 * The Student class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class Student extends User {
    // Members
    private String studentNo;
    private boolean gender;
    private String grade;
    private String department;
    List<Team> teams;

    // Constructors
    /**
     * The default constructor
     * 
     * @param id         The id of the student
     * @param name       The name of the student
     * @param phoneNo    The phone number of the student
     * @param email      The email of the student
     * @param studentNo  The student number of the student
     * @param gender     The gender of the student
     * @param grade      The grade of the student
     * @param department The department of the student
     */
    public Student(String id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade,
            String department) {
        super(id, name, phoneNo, email);
        this.studentNo = new String(studentNo);
        this.gender = gender;
        this.grade = new String(grade);
        this.department = new String(department);
        this.teams = new ArrayList<Team>();
    }

    /**
     * Copy constructor
     * 
     * @param student The student to be copied
     */
    public Student(Student student) {
        super(student);
        this.studentNo = new String(student.studentNo);
        this.gender = student.gender;
        this.grade = new String(student.grade);
        this.department = new String(student.department);
        this.teams = new ArrayList<Team>(student.teams);
    }

    // Methods
    /**
     * Get the student number of the student
     * 
     * @return The student number of the student
     */
    public String getStudentNo() {
        return new String(studentNo);
    }

    /**
     * Get the gender (sex~) of the student
     * 
     * @return A boolean value of the student
     */
    public boolean getGender() {
        return this.gender;
    }

    /**
     * Get the grade from the studentNo, in witch the current year minus the first
     * four digits of the studentNo
     * 
     * @return The grade of the student
     */
    public String getGrade() {
        return new String(grade);
    }

    /**
     * Get the department of the student
     * 
     * @return The department of the student
     */
    public String getDepartment() {
        return new String(department);
    }

    /**
     * Convert the student to a string
     * 
     * @return The string of the student
     */
    public String toString() {
        String info = super.toString();
        info += "_" + studentNo + "_" + (gender ? "Male" : "Female") + "_" + grade + "_" + department;
        return info;
    }

    /**
     * Give a list of teams that the student is in
     * 
     * @return A list of teams, newly created
     */
    public List<Team> getTeamList() {
        return new ArrayList<Team>(teams);
    }

}
