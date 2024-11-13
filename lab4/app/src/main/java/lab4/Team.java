package lab4;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Member variables
    private String teamId;
    private String teamName;
    private String department;
    private Student creator;
    private List<Student> studentList;
    private List<Teacher> teacherList;

    // Constructor
    /**
     * Constructor with Lists
     * 
     * @param teamId      The team ID
     * @param teamName    The team name
     * @param department  The department
     * @param creator     The creator
     * @param studentList The student list
     * @param teacherList The teacher list
     */
    public Team(String teamId, String teamName, String department, Student creator, List<Student> studentList,
            List<Teacher> teacherList) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.creator = creator;
        this.studentList = new ArrayList<>(studentList);
        this.teacherList = new ArrayList<>(teacherList);
    }

    // Constructor without Lists
    /**
     * Constructor without Lists
     * 
     * @param teamId     The team ID
     * @param teamName   The team name
     * @param department The department
     * @param creator    The creator
     */
    public Team(String teamId, String teamName, String department, Student creator) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.creator = creator;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    // Getters
    /**
     * Get the team ID
     * 
     * @return The team ID
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Get the team name
     * 
     * @return The team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Get the department
     * 
     * @return The department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Get the student list
     * 
     * @return The student list
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Get the teacher list
     * 
     * @return The teacher list
     */
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    /**
     * Get the creator
     * 
     * @return The creator
     */
    public Student getCreator() {
        return creator;
    }

    // Methods

    /**
     * Add a student to the student list
     * 
     * @param student The student to add
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }

    /**
     * Add a teacher to the teacher list
     * 
     * @param teacher The teacher to add
     */
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
}
