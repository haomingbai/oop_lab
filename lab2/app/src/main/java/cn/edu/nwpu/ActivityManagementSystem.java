/*
 * This source file was generated by the Gradle 'init' task
 */
package cn.edu.nwpu;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import cn.edu.nwpu.subsystem.ActivitySubSystem;
import cn.edu.nwpu.subsystem.UserSubSystem;
import cn.edu.nwpu.unit.Activity;
import cn.edu.nwpu.unit.ArtisticActivity;
import cn.edu.nwpu.unit.Organizer;
import cn.edu.nwpu.unit.PartyActivity;
import cn.edu.nwpu.unit.Student;
import cn.edu.nwpu.unit.Teacher;
import cn.edu.nwpu.unit.User;

/**
 * The activity management system. This system can be implemented as a class
 * library, and can also been implemented as a standalone system.
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class ActivityManagementSystem {

    // Members
    private ActivitySubSystem activitySubSystem;
    private UserSubSystem userSubSystem;

    // Constructors
    /**
     * Constructor
     * 
     * @param activitySubSystem The activity subsystem
     * @param userSubSystem     The user subsystem
     */
    public ActivityManagementSystem(ActivitySubSystem activitySubSystem, UserSubSystem userSubSystem) {
        this.activitySubSystem = new ActivitySubSystem(activitySubSystem);
        this.userSubSystem = new UserSubSystem(userSubSystem);
    }

    /**
     * Copy constructor
     * 
     * @param activityManagementSystem The activity management system to be copied
     */
    public ActivityManagementSystem(ActivityManagementSystem activityManagementSystem) {
        this.activitySubSystem = new ActivitySubSystem(activityManagementSystem.activitySubSystem);
        this.userSubSystem = new UserSubSystem(activityManagementSystem.userSubSystem);
    }

    /**
     * Constructor without parameters
     */
    public ActivityManagementSystem() {
        this.activitySubSystem = new ActivitySubSystem();
        this.userSubSystem = new UserSubSystem();
    }

    // Methods
    /**
     * Display all the activities
     */
    public void displayActivitySubSystem() {
        ActivitySubSystem activitySubSystem = this.activitySubSystem;
        for (Activity activity : activitySubSystem.getActivityList()) {
            System.out.println("Activities: ");
            System.out.println(activity.toString());
        }
    }

    /**
     * Display all the users
     */
    public void displayUserSubSystem() {
        UserSubSystem userSubSystem = this.userSubSystem;
        for (User user : userSubSystem.getAllStudents()) {
            System.out.println("Students: ");
            System.out.println(user.toString());
        }
        for (User user : userSubSystem.getAllTeachers()) {
            System.out.println("Teachers: ");
            System.out.println(user.toString());
        }
        for (User user : userSubSystem.getAllOrganizers()) {
            System.out.println("Organizers: ");
            System.out.println(user.toString());
        }
    }

    /**
     * Get the activity subsystem
     * 
     * @return The activity subsystem
     */
    public ActivitySubSystem getActivitySubSystem() {
        return this.activitySubSystem;
    }

    /**
     * Get the user subsystem
     * 
     * @return The user subsystem
     */
    public UserSubSystem getUserSubSystem() {
        return this.userSubSystem;
    }

    /**
     * An interactive command line interface
     * 
     * @param args The arguments, useless currently
     */
    public static void main(String[] args) {
        ActivityManagementSystem activityManagementSystem = new ActivityManagementSystem();
        ActivitySubSystem activitySubSystem = activityManagementSystem.getActivitySubSystem();
        UserSubSystem userSubSystem = activityManagementSystem.getUserSubSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your command in one line");
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            command = command.trim();
            if (command.equals("exit")) {
                break;
            }
            String[] commands = command.split(" ");
            try {
                if (commands[0].equals("user")) {
                    // User subsystem
                    if (commands.length < 2) {
                        throw new Exception("Invalid command: user subsystem");
                    }
                    if (commands[1].equals("add")) {
                        if (commands[2].equals("student")) {
                            // Add a student
                            String id = commands[3], name = commands[4], phoneNo = commands[5], email = commands[6],
                                    studentNo = commands[7];
                            boolean gender = commands[8].equals("female") ? false : true;
                            String grade = commands[9], department = commands[10];
                            Student student = new Student(id, name, phoneNo, email, studentNo, gender, grade,
                                    department);
                            userSubSystem.addStudent(student);
                        } else if (commands[2].equals("teacher")) {
                            // Add a teacher
                            String id = commands[3], name = commands[4], phoneNo = commands[5], email = commands[6],
                                    teacherNo = commands[7];
                            Teacher teacher = new Teacher(id, name, phoneNo, email, teacherNo);
                            userSubSystem.addTeacher(teacher);
                        } else if (commands[2].equals("organizer")) {
                            // Add an organizer
                            String id = commands[3], name = commands[4], phoneNo = commands[5], email = commands[6],
                                    unit = commands[7];
                            Organizer organizer = new Organizer(id, name, phoneNo, email, unit);
                            userSubSystem.addOrganizer(organizer);
                        } else if (commands[2].equals("team")) {
                            // Add a team
                            String creatorId = commands[3], teamId = commands[5], teamName = commands[5],
                                    department = commands[6];
                            userSubSystem.createTeam(creatorId, teamId, teamName, department);
                        } else {
                            throw new Exception("Invalid command: user subsystem, add");
                        }
                        System.out.println("User added successfully");
                    } else if (commands[1].equals("delete")) {
                        if (commands[2].equals("student")) {
                            // Delete a student
                            String id = commands[3];
                            userSubSystem.removeStudent(id);
                        } else if (commands[2].equals("teacher")) {
                            // Delete a teacher
                            String id = commands[3];
                            userSubSystem.removeTeacher(id);
                        } else if (commands[2].equals("organizer")) {
                            // Delete an organizer
                            String id = commands[3];
                            userSubSystem.removeOrganizer(id);
                        } else {
                            throw new Exception("Invalid command: user subsystem, delete");
                        }
                        System.out.println("User deleted successfully");
                    } else if (commands[1].equals("display")) {
                        // Display all the users
                        activityManagementSystem.displayUserSubSystem();
                    } else if (commands[1].equals("team")) {
                        // Add a member to a team
                        if (commands[2].equals("teacher")) {
                            // Add a teacher to a team
                            String teamId = commands[3], teacherId = commands[4];
                            userSubSystem.addTeacherToTeam(teamId, teacherId);
                        } else if (commands[2].equals("student")) {
                            // Add a student to a team
                            String teamId = commands[3], studentId = commands[4];
                            userSubSystem.addStudentToTeam(teamId, studentId);
                        } else {
                            throw new Exception("Invalid command: user subsystem, team");
                        }
                        System.out.println("Team member added successfully");
                    }
                } else if (commands[0].equals("activity")) {
                    // Activity subsystem
                    if (commands[1].equals("add")) {
                        Activity activity;
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        if (commands[2].equals("basic")) {
                            // Add a basic activity
                            String id = commands[3], name = commands[4], startTimeFirstString = commands[5],
                                    startTimeSecondString = commands[6], endTimeFirstString = commands[7],
                                    endTimeSecondString = commands[8], description = commands[9], site = commands[10];
                            Date startTime = new Date(
                                    format.parse(startTimeFirstString + " " + startTimeSecondString).getTime());
                            Date endTime = new Date(
                                    format.parse(endTimeFirstString + " " + endTimeSecondString).getTime());
                            activity = new Activity(id, name, startTime, endTime, description, site);
                        } else if (commands[2].equals("artistic")) {
                            // Add an artistic activity
                            String id = commands[3], name = commands[4], startTimeFirstString = commands[5],
                                    startTimeSecondString = commands[6], endTimeFirstString = commands[7],
                                    endTimeSecondString = commands[8], description = commands[9], site = commands[10],
                                    type = commands[11];
                            Date startTime = new Date(
                                    format.parse(startTimeFirstString + " " + startTimeSecondString).getTime());
                            Date endTime = new Date(
                                    format.parse(endTimeFirstString + " " + endTimeSecondString).getTime());
                            activity = new ArtisticActivity(id, name, startTime, endTime, description, site, type);
                        } else if (commands[2].equals("party")) {
                            // Add a party activity
                            String id = commands[3], name = commands[4], startTimeFirstString = commands[5],
                                    startTimeSecondString = commands[6], endTimeFirstString = commands[7],
                                    endTimeSecondString = commands[8], description = commands[9], site = commands[10],
                                    theme = commands[11], classification = commands[12];
                            Date startTime = new Date(
                                    format.parse(startTimeFirstString + " " + startTimeSecondString).getTime());
                            Date endTime = new Date(
                                    format.parse(endTimeFirstString + " " + endTimeSecondString).getTime());
                            activity = new PartyActivity(id, name, startTime, endTime, description, site, theme,
                                    classification);
                        } else if (commands[2].equals("lecture")) {
                            // Add a lecture activity
                            String id = commands[3], name = commands[4], startTimeFirstString = commands[5],
                                    startTimeSecondString = commands[6], endTimeFirstString = commands[7],
                                    endTimeSecondString = commands[8], description = commands[9], site = commands[10],
                                    keySpeaker = commands[11];
                            Date startTime = new Date(
                                    format.parse(startTimeFirstString + " " + startTimeSecondString).getTime());
                            Date endTime = new Date(
                                    format.parse(endTimeFirstString + " " + endTimeSecondString).getTime());
                            activity = new ArtisticActivity(id, name, startTime, endTime, description, site,
                                    keySpeaker);
                        } else {
                            throw new Exception("Invalid command: activity subsystem, add");
                        }
                        activitySubSystem.addActivity(activity);
                        System.out.println("Activity added successfully");
                    } else if (commands[1].equals("query")) {
                        // Check how many activities are joined by a group
                        String teamId = commands[2];
                        int num = activitySubSystem.checkActivityNumOfTeam(teamId);
                        System.out.println(
                                "The number of activities joined by team " + teamId + " is " + Integer.toString(num));
                    } else if (commands[1].equals("select")) {
                        // Get the activities by condition
                        if (commands[2].equals("date")) {
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                            String dateFirstString = commands[3], dateSecondString = commands[4];
                            Date date = new Date(format.parse(dateFirstString + " " + dateSecondString).getTime());
                            List<Activity> activities = activitySubSystem.getActivitiesByDate(date);
                            for (Activity activity : activities) {
                                System.out.println(activity.toString());
                            }
                        } else if (commands[2].equals("id")) {
                            String id = commands[3];
                            Activity activity = activitySubSystem.getActivityById(id);
                            System.out.println(activity.toString());
                        } else if (commands[2].equals("all")) {
                            List<Activity> activities = activitySubSystem.getActivityList();
                            for (Activity activity : activities) {
                                System.out.println(activity.toString());
                            }
                        } else {
                            throw new Exception("Invalid command: activity subsystem, select");
                        }
                    } else if (commands[1].equals("delete")) {
                        String id = commands[2];
                        activitySubSystem.removeActivityById(id);
                        System.out.println("Activity deleted successfully");
                    } else {
                        throw new Exception("Invalid command: activity subsystem");
                    }
                } else if (commands[0].equals("help")) {
                    System.out.println("Commands: <subsystem> <operation> <parameters>");
                    System.out.println("Subsystems: user, activity");
                    System.out.println("Operations for user: add, delete, display, team");
                    System.out.println("Operations for activity: add, query, select, delete");
                    System.out.println("Example: user add student stuid stuname 138xxxx5xx5 haoxxxxxxx@hotxxxx.com 202xxxxxxx female mygrade mydepartment");
                    System.out.println("Example: activity add basic actid actname 2021-06-01 12:00:00 2021-06-01 13:00:00 actdesc actsite");
                } else {
                    throw new Exception("Invalid command: invalid subsystem name.");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println(e.getMessage());
                System.err.println("Nothing changed");
            }
        }
        scanner.close();
    }
}