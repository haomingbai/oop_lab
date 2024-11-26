package cn.edu.nwpu;

import java.util.Date;

public class ConsultRecord {
    Date date;

    Student student;
    ConsultingRoom consultingRoom;
    Consultant consultant;
    int id;

    /**
     * Constructs a new ConsultRecord with the specified date, student, consulting room, and consultant.
     *
     * @param date           the date of the consultation
     * @param student        the student involved in the consultation
     * @param consultingRoom the consulting room where the consultation takes place
     * @param consultant     the consultant conducting the consultation
     */
    public ConsultRecord(Date date, Student student, ConsultingRoom consultingRoom, Consultant consultant) {
        this.date = date;
        this.student = student;
        this.consultingRoom = consultingRoom;
        this.consultant = consultant;
        id = (student.toString() + date.toString() + consultingRoom.toString() + consultant.toString()).hashCode();
    }

    /**
     * Returns the date of the consultation record.
     *
     * @return the date of the consultation
     */
    public Date getDate() {
        return date;
    }

    /**
     * Retrieves the student associated with this consult record.
     *
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Returns the consulting room associated with this consult record.
     *
     * @return the consulting room
     */
    public ConsultingRoom getConsultingRoom() {
        return consultingRoom;
    }

    /**
     * Retrieves the consultant associated with this consult record.
     *
     * @return the consultant
     */
    public Consultant getConsultant() {
        return consultant;
    }

    public int getId() {
        return id;
    }
}
