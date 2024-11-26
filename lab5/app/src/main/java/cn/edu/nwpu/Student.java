package cn.edu.nwpu;

import java.util.Date;

public class Student {
    private String studentId;
    private String name;
    private boolean gender; // female is true
    private String department;
    private String phone;
    private Date birthday;

    // Constructor
    /**
     * Constructor
     * @param studentId the student id of the student
     * @param name the name of the student
     * @param gender the gender of the student, true for female, false for male.
     * @param department the department of the student
     * @param birthday the birthday of the student
     */
    public Student(String studentId, String name, boolean gender, String department, String phone, Date birthday) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.birthday = birthday;
    }

    // Getter
    /**
     * Get the student id of the student
     * @return the student id of the student
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Get the name of the student
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Get the gender of the student
     * @return the gender of the student
     */
    public boolean getGender() {
        return gender;
    }

    /**
     * Retrieves the department of the student.
     *
     * @return the department of the student as a String.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Retrieves the phone number of the student.
     *
     * @return the phone number of the student as a String.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Retrieves the birthday of the student.
     *
     * @return the birthday of the student as a Date object
     */
    public Date getBirthday() {
        return birthday;
    }
}
