package cn.edu.nwpu.unit;

import java.util.Date;

/**
 * The party activity class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class PartyActivity extends Activity {
    // Members
    private String theme;
    private String classification;

    // Constructors
    /**
     * Constructor
     * 
     * @param id             The id of the party activity
     * @param name           The name of the party activity
     * @param startTime      The start time of the party activity
     * @param endTime        The end time of the party activity
     * @param description    The description of the party activity
     * @param site           The site of the party activity
     * @param theme          The theme of the party activity
     * @param classification The classification of the party activity
     */
    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site,
            String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = new String(theme);
        this.classification = new String(classification);
    }

    /**
     * Constructor without description
     * 
     * @param id             The id of the party activity
     * @param name           The name of the party activity
     * @param startTime      The start time of the party activity
     * @param endTime        The end time of the party activity
     * @param site           The site of the party activity
     * @param theme          The theme of the party activity
     * @param classification The classification of the party activity
     */
    public PartyActivity(String id, String name, Date startTime, Date endTime, String site, String theme,
            String classification) {
        super(id, name, startTime, endTime, site);
        this.theme = new String(theme);
        this.classification = new String(classification);
    }

    /**
     * Copy constructor
     * 
     * @param partyActivity The party activity to be copied
     */
    public PartyActivity(PartyActivity partyActivity) {
        super(partyActivity);
        this.theme = new String(partyActivity.theme);
        this.classification = new String(partyActivity.classification);
    }

    // Methods
    /**
     * Get the theme of the party activity
     * 
     * @return The theme of the party activity
     */
    public String getTheme() {
        return new String(theme);
    }

    /**
     * Get the classification of the party activity
     * 
     * @return The classification of the party activity
     */
    public String getClassification() {
        return new String(classification);
    }

    /**
     * Convert the party activity to a string
     * 
     * @return The string containing the basic information of the party activity
     */
    @Override
    public String toString() {
        String info = super.toString();
        info += "_" + theme + "_" + classification;
        return info;
    }
}
