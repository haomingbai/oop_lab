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
    public Team(String teamId, String teamName, String department, List<Student> studentList, List<Teacher> teacherList) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.studentList = new ArrayList<>(studentList);
        this.teacherList = new ArrayList<>(teacherList);
    }

    // Constructor without Lists
    public Team(String teamId, String teamName, String department) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    // Getters
    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDepartment() {
        return department;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public Student getCreator() {
        return creator;
    }

    // Methods

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
}
