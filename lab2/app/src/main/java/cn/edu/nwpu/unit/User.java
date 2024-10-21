package cn.edu.nwpu.unit;

/**
 * The user class, which is suggested to be the parent class of different kinds
 * of users and used with the user subsystem.
 * 
 * @author Haoming Bai
 * @version 0.1
 */
public class User {
    // Members
    private String id;
    private String name;
    private String phoneNo;
    private String email;

    // Constructors
    /**
     * The constructor of the user
     * 
     * @param id      The id of the user
     * @param name    The name of the user
     * @param email   The email of the user
     * @param phoneNo The phone number of the user
     */
    public User(String id, String name, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    /**
     * Default constructor
     */
    public User() {
        this.id = "";
        this.name = "";
        this.email = "";
        this.phoneNo = "";
    }

    /**
     * Copy constructor
     * 
     * @param user The user to be copied
     */
    public User(User user) {
        this.id = new String(user.id);
        this.name = new String(user.name);
        this.email = new String(user.email);
        this.phoneNo = new String(user.phoneNo);
    }

    // Methods
    /**
     * Get the id of the user
     * 
     * @return The id of the user
     */
    public String getId() {
        return new String(id);
    }

    /**
     * Get the name of the user
     * 
     * @return The name of the user
     */
    public String getName() {
        return new String(name);
    }

    /**
     * Get the email of the user
     * 
     * @return The email of the user
     */
    public String getEmail() {
        return new String(email);
    }

    /**
     * Get the phone number of the user
     * 
     * @return The phone number of the user
     */
    public String getPhoneNo() {
        return new String(phoneNo);
    }

    /**
     * Set the name of the user
     * 
     * @param name The name of the user
     */
    public void setName(String name) {
        this.name = new String(name);
    }

    /**
     * Set the email of the user
     * 
     * @param email The email address of the user
     */
    public void setEmail(String email) {
        this.email = new String(email);
    }

    /**
     * Judge whether the user is equal to another user
     * 
     * @param user The user to be compared
     * @return Whether the two users are equal
     */
    public boolean equals(User user) {
        return this.id.equals(user.id);
    }

    /**
     * @return The string representation of the user
     */
    public String toString() {
        return this.getId() + "_" + this.getName() + "_" + this.getPhoneNo() + "_" + this.getEmail();
    }
}
