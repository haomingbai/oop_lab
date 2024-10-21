package cn.edu.nwpu.subsystem;

import java.util.List;
import java.util.ArrayList;
import cn.edu.nwpu.unit.User;
import cn.edu.nwpu.unit.Student;
import cn.edu.nwpu.unit.Teacher;
import cn.edu.nwpu.unit.Organizer;
import cn.edu.nwpu.unit.Team;

/**
 * The user subsystem. Besides, this subsystem can be also implemented as a
 * standalone system.
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class UserSubSystem {
    private List<User> users;

    // Constructors
    /**
     * Constructor
     * 
     * @param users The list of users who should be in the system
     */
    public UserSubSystem(List<User> users) {
        this.users = new ArrayList<User>(users);
    }

    /**
     * Constructor without parameters
     */
    public UserSubSystem() {
        this.users = new ArrayList<User>();
    }

    /**
     * Copy constructor
     * 
     * @param userSubSystem The user subsystem to be copied
     */
    public UserSubSystem(UserSubSystem userSubSystem) {
        this.users = new ArrayList<User>(userSubSystem.users);
    }

    // Methods
    /**
     * Add a user to the user list
     * 
     * @param user The user to be added
     */
    private void addUser(User user) {
        users.add(user);
    }

    /**
     * Add a student to the user list
     * 
     * @param student The student to be added
     */
    public void addStudent(Student student) {
        this.addUser(student);
    }

    /**
     * Add a teacher to the user list
     * 
     * @param teacher The teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        this.addUser(teacher);
    }

    /**
     * Add an organizer to the user list
     * 
     * @param organizer The organizer to be added
     */
    public void addOrganizer(Organizer organizer) {
        this.addUser(organizer);
    }

    /**
     * Remove a teacher from the user list
     * 
     * @param id The teacher to be removed
     */
    public void removeTeacher(String id) {
        for (User user : users) {
            if (user instanceof Teacher && user.getId().equals(id)) {
                users.remove(user);
                break;
            }
        }
    }

    /**
     * Remove a student from the user list
     * 
     * @param id The student to be removed
     */
    public void removeStudent(String id) {
        for (User user : users) {
            if (user instanceof Student && user.getId().equals(id)) {
                users.remove(user);
                break;
            }
        }
    }

    /**
     * Remove an organizer from the user list
     * 
     * @param id The organizer to be removed
     */
    public void removeOrganizer(String id) {
        for (User user : users) {
            if (user instanceof Organizer && user.getId().equals(id)) {
                users.remove(user);
                break;
            }
        }
    }

    /**
     * Get the Student by id
     * 
     * @param id The id of the student
     * @return The student with the id
     */
    public Student getStudentById(String id) {
        for (User user : users) {
            if (user instanceof Student && user.getId().equals(id)) {
                return (Student) user;
            }
        }
        return null;
    }

    /**
     * Get the Teacher by id
     * 
     * @param id The id of the teacher
     * @return The teacher with the id
     */
    public Teacher getTeacherById(String id) {
        for (User user : users) {
            if (user instanceof Teacher && user.getId().equals(id)) {
                return (Teacher) user;
            }
        }
        return null;
    }

    /**
     * Get the Organizer by id
     * 
     * @param id The id of the organizer
     * @return The organizer with the id
     */
    public Organizer getOrganizerById(String id) {
        for (User user : users) {
            if (user instanceof Organizer && user.getId().equals(id)) {
                return (Organizer) user;
            }
        }
        return null;
    }

    /**
     * Get all the students
     * 
     * @return The list of all the students
     */
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    /**
     * Get all the teachers
     * 
     * @return The list of all the teachers
     */
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        for (User user : users) {
            if (user instanceof Teacher) {
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    /**
     * Get all the organizers
     * 
     * @return The list of all the organizers
     */
    public List<Organizer> getAllOrganizers() {
        List<Organizer> organizers = new ArrayList<Organizer>();
        for (User user : users) {
            if (user instanceof Organizer) {
                organizers.add((Organizer) user);
            }
        }
        return organizers;
    }

    /**
     * Create a team with the studentId, teamId and Name and department
     * 
     * @param creatorId  The id of the creator
     * @param teamId     The id of the team
     * @param teamName   The name of the team
     * @param department The department of the team
     */
    public void createTeam(String creatorId, String teamId, String teamName, String department) {
        // Judge whether the teamId is already exist
        for (User user : users) {
            if (user instanceof Student) {
                List<Team> teamList = ((Student) user).getTeamList();
                for (Team team : teamList) {
                    if (team.getTeamId().equals(teamId)) {
                        throw new IllegalArgumentException("The teamId is already exist");
                    }
                }
            }
        }

        Student creator = this.getStudentById(creatorId);
        Team team = new Team(teamId, teamName, department, creator);
        team.addStudentToTeam(creator);
    }

    /**
     * Add a student to the team
     * 
     * @param studentId The id of the student
     * @param teamId    The id of the team
     */
    public void addStudentToTeam(String studentId, String teamId) {
        Student student = this.getStudentById(studentId);
        if (student != null) {
            return;
        }
        Team team;
        for (User user : users) {
            if (user instanceof Student) {
                for (Team t : ((Student) user).getTeamList()) {
                    if (t.getTeamId().equals(teamId)) {
                        team = t;
                        team.addStudentToTeam(student);
                    }
                }
            }
        }
    }

    /**
     * Add a teacher to the team
     * 
     * @param teacherId The id of the teacher
     * @param teamId    The id of the team
     */
    public void addTeacherToTeam(String teacherId, String teamId) {
        Teacher teacher = this.getTeacherById(teacherId);
        if (teacher != null) {
            return;
        }
        Team team;
        for (User user : users) {
            if (user instanceof Student) {
                for (Team t : ((Student) user).getTeamList()) {
                    if (t.getTeamId().equals(teamId)) {
                        team = t;
                        team.addTeacherToTeam(teacher);
                    }
                }
            }
        }
    }
}
