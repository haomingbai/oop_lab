package cn.edu.nwpu;

public class CollegeConsultant extends Consultant {
    private String school;

    /**
     * Constructs a new CollegeConsultant with the specified details.
     *
     * @param id     the unique identifier of the consultant
     * @param name   the name of the consultant
     * @param phone  the contact phone number of the consultant
     * @param intro  a brief introduction of the consultant
     * @param school the school associated with the consultant
     */
    public CollegeConsultant(String id, String name, String phone, String intro, String school) {
        super(id, name, phone, intro);
        this.school = school;
    }

    /**
     * Retrieves the department of the college consultant.
     *
     * @return the department of the college consultant.
     */
    public String getSchool() {
        return school;
    }

}
