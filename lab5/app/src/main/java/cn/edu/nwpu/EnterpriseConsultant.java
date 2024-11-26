package cn.edu.nwpu;

public class EnterpriseConsultant extends Consultant {
    private String company;

    /**
     * Constructs a new EnterpriseConsultant with the specified details.
     *
     * @param id      the unique identifier of the consultant
     * @param name    the name of the consultant
     * @param phone   the contact phone number of the consultant
     * @param intro   a brief introduction of the consultant
     * @param company the company associated with the consultant
     */
    public EnterpriseConsultant(String id, String name, String phone, String intro, String company) {
        super(id, name, phone, intro);
        this.company = company;
    }

    /**
     * Retrieves the company of the enterprise consultant.
     *
     * @return the company of the enterprise consultant.
     */
    public String getCompany() {
        return company;
    }

}
