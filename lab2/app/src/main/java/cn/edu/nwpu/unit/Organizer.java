package cn.edu.nwpu.unit;

/**
 * The Organizer class
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class Organizer extends User {
    // Members
    private String unit;

    // Constructors
    /**
     * The default constructor
     * 
     * @param id      The id of the organizer
     * @param name    The name of the organizer
     * @param phoneNo The phone number of the organizer
     * @param email   The email of the organizer
     * @param unit    The unit of the organizer
     */
    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = new String(unit);
    }

    /**
     * Copy constructor
     * 
     * @param organizer The organizer to be copied
     */
    public Organizer(Organizer organizer) {
        super(organizer);
        this.unit = new String(organizer.unit);
    }

    // Methods
    /**
     * Get the unit of the organizer
     * 
     * @return The unit of the organizer
     */
    public String getUnit() {
        return new String(unit);
    }

    /**
     * Convert the organizer to a string
     * 
     * @return The string of the organizer
     */
    public String toString() {
        String info = super.toString();
        info += "_" + unit;
        return info;
    }
}
