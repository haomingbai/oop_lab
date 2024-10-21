package cn.edu.nwpu.subsystem;

import cn.edu.nwpu.unit.Activity;
import cn.edu.nwpu.unit.Team;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * The activity subsystem. Besides, this subsystem can be also implemented as a
 * standalone system.
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class ActivitySubSystem {
    // Members
    private List<Activity> activities;

    // Constructors
    /**
     * Constructor
     * 
     * @param activities The activities
     */
    public ActivitySubSystem(List<Activity> activities) {
        this.activities = new ArrayList<Activity>(activities);
    }

    /**
     * Copy constructor
     * 
     * @param activitySubSystem The activity subsystem to be copied
     */
    public ActivitySubSystem(ActivitySubSystem activitySubSystem) {
        this.activities = new ArrayList<Activity>(activitySubSystem.activities);
    }

    /**
     * Constructure without parameters
     */
    public ActivitySubSystem() {
        this.activities = new ArrayList<Activity>();
    }

    // Methods
    /**
     * Add an activitie to the activity list
     * 
     * @param activity The activity to be added
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * remove an activity from the system by id
     * 
     * @param id The id of the activity to be removed
     */
    public void removeActivityById(String id) {
        for (Activity activity : activities) {
            if (activity.getId().equals(id)) {
                activities.remove(activity);
                break;
            }
        }
    }

    /**
     * Get the activity by id
     * 
     * @param id The id of the activity
     * 
     * @return The activity with the id
     */
    public Activity getActivityById(String id) {
        for (Activity activity : activities) {
            if (activity.getId().equals(id)) {
                return activity;
            }
        }
        return null;
    }

    /**
     * Get the activities by Date
     * 
     * @param date The date of the activities
     * @return The list of activities got by Date
     */
    public List<Activity> getActivitiesByDate(Date date) {
        List<Activity> activitiesByDate = new ArrayList<Activity>();
        for (Activity activity : activities) {
            if (activity.getStartTime().compareTo(date) <= 0 && activity.getEndTime().compareTo(date) >= 0) {
                activitiesByDate.add(activity);
            }
        }
        return activitiesByDate;
    }

    /**
     * Get all the activities
     * 
     * @return The list of all the activities
     */
    public List<Activity> getActivityList() {
        return new ArrayList<Activity>(activities);
    }

    /**
     * Get the number of activities of a certain team
     * 
     * @param teamId The id of the team to be queried
     * @return The number of activities of the team
     */
    public int checkActivityNumOfTeam(String teamId) {
        int num = 0;
        for (Activity activity : activities) {
            Iterator<Team> it = activity.getTeamIterator();
            while (it.hasNext()) {
                if (teamId.equals(it.next().getTeamId())) {
                    num++;
                }
            }
        }
        return num;
    }
}