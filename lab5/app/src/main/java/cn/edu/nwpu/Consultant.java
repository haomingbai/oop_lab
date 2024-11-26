package cn.edu.nwpu;

/**
 * The Consultant class represents a consultant with an ID, name, phone number, and introduction.
 * It provides methods to get and set these properties.
 */
public class Consultant {
    private String id;
    private String name;
    private String phone;
    private String intro;

    /**
     * Constructs a new Consultant with the specified details.
     *
     * @param id the unique identifier for the consultant
     * @param name the name of the consultant
     * @param phone the phone number of the consultant
     * @param intro a brief introduction of the consultant
     */
    public Consultant(String id, String name, String phone, String intro) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.intro = intro;
    }

    /**
     * Retrieves the unique identifier of the consultant.
     *
     * @return the consultant's unique identifier as a String.
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the name of the consultant.
     *
     * @return the name of the consultant
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the phone number of the consultant.
     *
     * @return the phone number as a String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the introduction of the consultant.
     *
     * @return a string representing the consultant's introduction.
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the phone number for the consultant.
     *
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets the introduction text for the consultant.
     *
     * @param intro the introduction text to be set
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * Sets the ID of the consultant.
     *
     * @param id the new ID to be assigned to the consultant
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the name of the consultant.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
