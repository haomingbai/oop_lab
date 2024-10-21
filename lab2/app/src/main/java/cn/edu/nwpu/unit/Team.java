package cn.edu.nwpu.unit;

import java.util.List;
import java.util.ArrayList;

/**
 * Team class
 * 
 * @author Haoming Bai
 * @version 1.0
 */
public class Team {
    private String teamId;
    private String teamName;
    private String depatment;
    private Student creator;
    List<Student> students;
    List<Teacher> teachers;

    /**
     * Constructor
     * 
     * @param teamId    The team id
     * @param teamName  The team name
     * @param depatment The department
     * @param creator   The creator of the team
     */
    public Team(String teamId, String teamName, String depatment, Student creator) {
        this.teamId = new String(teamId);
        this.teamName = new String(teamName);
        this.depatment = new String(depatment);
        this.creator = creator;
        creator.teams.add(this);
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * Copy constructor
     * 
     * @param team The team to be copied
     */
    public Team(Team team) {
        this.teamId = new String(team.teamId);
        this.teamName = new String(team.teamName);
        this.depatment = new String(team.depatment);
        this.creator = team.creator;
        this.students = new ArrayList<Student>(team.students);
        this.teachers = new ArrayList<Teacher>(team.teachers);
    }

    /**
     * Get the team id
     * 
     * @return The team id
     */
    public String getTeamId() {
        return new String(teamId);
    }

    /**
     * Get the team name
     * 
     * @return The team name
     */
    public String getTeamName() {
        return new String(teamName);
    }

    /**
     * Get the department
     * 
     * @return The department
     */
    public String getDepatment() {
        return new String(depatment);
    }

    /**
     * Get the creator
     * 
     * @return The creator
     */
    public Student getCreator() {
        return creator;
    }

    /**
     * Convert the team to a string
     * 
     * @return The string representation of the team
     */
    public String toString() {
        return teamId + "_" + teamName + "_" + depatment + "_" + creator.toString();
    }

    /**
     * Add a student to the team
     * 
     * @param student The student to be added
     */
    public void addStudentToTeam(Student student) {
        students.add(student);
        student.teams.add(this);
    }

    /**
     * Add a teacher to the team
     * 
     * @param teacher The teacher to be added
     */
    public void addTeacherToTeam(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Get the student list
     * 
     * @return The student list, newly created
     */
    public List<Student> getStudentList() {
        return new ArrayList<Student>(students);
    }

    /**
     * Get the teacher list
     * 
     * @return The teacher list, newly created
     */
    public List<Teacher> getTeacherList() {
        return new ArrayList<Teacher>(teachers);
    }
}
