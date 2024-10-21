package cn.edu.nwpu.unit;

import java.util.Date;

/**
 * The lecture activity class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class LectureActivity extends Activity {
    // Members
    private String keySpeaker;

    // Constructors
    /**
     * Constructor
     * 
     * @param id          The id of the lecture activity
     * @param name        The name of the lecture activity
     * @param startTime   The start time of the lecture activity
     * @param endTime     The end time of the lecture activity
     * @param description The description of the lecture activity
     * @param site        The site of the lecture activity
     * @param keySpeaker  The key speaker of the lecture activity
     */
    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site,
            String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = new String(keySpeaker);
    }
    
    /**
     * Constructor without description
     * 
     * @param id         The id of the lecture activity
     * @param name       The name of the lecture activity
     * @param startTime  The start time of the lecture activity
     * @param endTime    The end time of the lecture activity
     * @param site       The site of the lecture activity
     * @param keySpeaker The key speaker of the lecture activity
     */
    public LectureActivity(String id, String name, Date startTime, Date endTime, String site, String keySpeaker) {
        super(id, name, startTime, endTime, site);
        this.keySpeaker = new String(keySpeaker);
    }

    /**
     * Copy constructor
     * 
     * @param lectureActivity The lecture activity to be copied
     */
    public LectureActivity(LectureActivity lectureActivity) {
        super(lectureActivity);
        this.keySpeaker = new String(lectureActivity.keySpeaker);
    }

    // Methods
    /**
     * Get the key speaker of the lecture activity
     * 
     * @return The key speaker of the lecture activity
     */
    public String getKeySpeaker() {
        return new String(keySpeaker);
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "_" + keySpeaker;
        return info;
    }
}