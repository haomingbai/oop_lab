package cn.edu.nwpu.unit;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Activity class, which is suggested to be uses as a base class for other with
 * the activity management system.
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class Activity {
    private String id;
    private String name;
    private Date startTime;
    private Date endTime;
    private String description;
    private String site;
    List<Organizer> orginizers;
    List<Teacher> teachers;
    List<Team> teams;

    // Constructors
    /**
     * Default constructor
     *
     * @param id The id of the activity
     * @param name The name of the activity
     * @param startTime The start time of the activity
     * @param endTime The end time of the activity
     * @param description The description of the activity
     * @param site The site of the activity
     */
    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = new String(id);
        this.name = new String(name);
        this.startTime = (Date) (startTime.clone());
        this.endTime = (Date) (endTime.clone());
        this.description = new String(description);
        this.site = new String(site);
        this.orginizers = new ArrayList<Organizer>();
        this.teachers = new ArrayList<Teacher>();
        this.teams = new ArrayList<Team>();
    }

    /**
     * Constructor without description
     * 
     * @param id The id of the activity
     * @param name The name of the activity
     * @param startTime The start time of the activity
     * @param endTime The end time of the activity
     * @param site The site of the activity
     */
    public Activity(String id, String name, Date startTime, Date endTime, String site) {
        this.id = new String(id);
        this.name = new String(name);
        this.startTime = (Date) (startTime.clone());
        this.endTime = (Date) (endTime.clone());
        this.description = "";
        this.site = new String(site);
        this.orginizers = new ArrayList<Organizer>();
        this.teachers = new ArrayList<Teacher>();
        this.teams = new ArrayList<Team>();
    }

    /**
     * Copy constructor
     *
     * @param activity The activity to be copied
     */
    public Activity(Activity activity) {
        this.id = new String(activity.id);
        this.name = new String(activity.name);
        this.startTime = (Date) (activity.startTime.clone());
        this.endTime = (Date) (activity.endTime.clone());
        this.description = new String(activity.description);
        this.site = new String(activity.site);
        this.orginizers = new ArrayList<Organizer>(activity.orginizers);
        this.teachers = new ArrayList<Teacher>(activity.teachers);
        this.teams = new ArrayList<Team>(activity.teams);
    }

    // Methods
    /**
     * Get the id of the activity
     *
     * @return The id of the activity
     */
    public String getId() {
        return new String(id);
    }

    /**
     * Get the name of the activity
     *
     * @return The name of the activity
     */
    public String getName() {
        return new String(name);
    }

    /**
     * Get the start time of the activity
     *
     * @return The start time of the activity
     */
    public Date getStartTime() {
        return (Date) (startTime.clone());
    }

    /**
     * Get the end time of the activity
     *
     * @return The end time of the activity
     */
    public Date getEndTime() {
        return (Date) (endTime.clone());
    }

    /**
     * Get the description of the activity
     *
     * @return The description of the activity
     */
    public String getDescription() {
        return new String(description);
    }

    /**
     * Get the site of the activity
     *
     * @return The site of the activity
     */
    public String getSite() {
        return new String(site);
    }

    /**
     * Set the description of the activity
     * 
     * @param description description of the activity
     */
    public void setDescription(String description) {
        this.description = new String(description);
    }

    /**
     * Add an organizer to the activity
     * 
     * @param organizer The organizer to be added
     */
    public void addOrganizerToActivity(Organizer organizer) {
        orginizers.add(organizer);
    }

    /**
     * Add a teacher to the activity
     * 
     * @param teacher The teacher to be added
     */
    public void addTeacherToActivity(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Remove an organizer from the activity
     * 
     * @param id The id of the organizer to be removed
     */
    public void removeOrganizerFromActivity(String id) {
        for (Organizer organizer : orginizers) {
            if (organizer.getId().equals(id)) {
                orginizers.remove(organizer);
                break;
            }
        }
    }

    /**
     * Remove a teacher from the activity
     * 
     * @param id The id of the teacher to be removed
     */
    public void removeTeacherFromActivity(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                teachers.remove(teacher);
                break;
            }
        }
    }

    /**
     * Add a team to the activity
     * 
     * @param team The team to be added
     */
    public void addTeamToActivity(Team team) {
        teams.add(team);
    }

    /**
     * Remove a team from the activity
     * 
     * @param id The id of the team to be removed
     */
    public void removeTeamFromActivity(String id) {
        for (Team team : teams) {
            if (team.getTeamId().equals(id)) {
                teams.remove(team);
                break;
            }
        }
    }

    /**
     * Convert the activity to a string
     * 
     * @return The string of the activity
     */
    public String toString() {
        return this.id + "_" + this.name + "_" + this.startTime + "_" + this.endTime + "_" + this.description + "_"
                + this.site;
    }

    /**
     * Check if the activity is equal to another object depending on the id
     * 
     * @param obj The object to be compared
     * @return True if the activity is equal to the object, false otherwise
     */
    public boolean equals(Object obj) {
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            return this.id.equals(activity.id);
        }
        return false;
    }

    /**
     * Get the iterator of the teachers
     * 
     * @return The iterator of the teachers' list
     */
    public Iterator<Teacher> getTeacherIterator() {
        return teachers.iterator();
    }

    /**
     * Get the iterator of the organizers' list
     * 
     * @return The iterator of the organizers' list
     */
    public Iterator<Organizer> getOrganizerIterator() {
        return orginizers.iterator();
    }

    /**
     * Get the iterator of the teams' list
     * 
     * @return The iterator of the teams' list
     */
    public Iterator<Team> getTeamIterator() {
        return teams.iterator();
    }
}