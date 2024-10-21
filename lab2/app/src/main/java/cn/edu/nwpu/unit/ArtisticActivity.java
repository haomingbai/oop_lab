package cn.edu.nwpu.unit;

import java.util.Date;

/**
 * The ArtisticActivity class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class ArtisticActivity extends Activity {
    // Members
    private String type;

    // Constructors
    /**
     * Constructor
     * 
     * @param id          The id of the artistic activity
     * @param name        The name of the artistic activity
     * @param startTime   The start time of the artistic activity
     * @param endTime     The end time of the artistic activity
     * @param description The description of the artistic activity
     * @param site        The site of the artistic activity
     * @param type        The type of the artistic activity
     */
    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site,
            String type) {
        super(id, name, startTime, endTime, description, site);
        this.type = new String(type);
    }

    /**
     * Constructor without description
     * 
     * @param id        The id of the artistic activity
     * @param name      The name of the artistic activity
     * @param startTime The start time of the artistic activity
     * @param endTime   The end time of the artistic activity
     * @param site      The site of the artistic activity
     * @param type      The type of the artistic activity
     */
    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String site, String type) {
        super(id, name, startTime, endTime, site);
        this.type = new String(type);
    }

    /**
     * Copy constructor
     * 
     * @param artisticActivity The artistic activity to be copied
     */
    public ArtisticActivity(ArtisticActivity artisticActivity) {
        super(artisticActivity);
        this.type = new String(artisticActivity.type);
    }

    // Methods
    /**
     * Get the type of the artistic activity
     * 
     * @return The type of the artistic activity
     */
    public String getType() {
        return new String(type);
    }

    @Override
    public String toString() {
        String info = super.toString();
        info += "_" + type;
        return info;
    }
}
