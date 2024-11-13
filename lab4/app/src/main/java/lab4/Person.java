package lab4;

public abstract class Person {
    // Member variables
    private String id;
    private String name;
    private String phoneNo;
    private String email;
    private String department;

    // Constructor
    /**
     * Constructor
     * 
     * @param id         the id of the person
     * @param name       the name of the person
     * @param phoneNo    the phone number of the person
     * @param email      the email of the person
     * @param department the department of the person
     */
    public Person(String id, String name, String phoneNo, String email, String department) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.department = department;
    }

    // Getters

    /**
     * Get the id
     * 
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * Get the name
     * 
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the phone number
     * 
     * @return The phone number
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Get the email
     * 
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get the department
     * 
     * @return The department
     */
    public String getDepartment() {
        return department;
    }

    // Setters

    /**
     * Set the id
     * 
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Set the name
     * 
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the phone number
     * 
     * @param phoneNo The phone number
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Set the email
     * 
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Set the department
     * 
     * @param department The department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
