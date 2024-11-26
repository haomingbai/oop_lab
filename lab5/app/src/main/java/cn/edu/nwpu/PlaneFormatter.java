package cn.edu.nwpu;

import java.text.SimpleDateFormat;
import java.util.List;

public class PlaneFormatter {
    /**
     * Formats a ConsultRecord object into a string with various fields separated by underscores.
     *
     * The format of the resulting string is as follows:
     * yyyy-MM-dd_HH:mm:ss_studentName_studentId_studentPhone_studentGender_studentDepartment_studentBirthday_
     * consultingRoomId_consultingRoomCampus_consultingRoomBuilding_consultingRoomRoomNum_
     * consultantName_consultantId_consultantPhone_consultantIntro_consultantSchoolOrCompany
     *
     * @param record the ConsultRecord object to be formatted
     * @return a formatted string representing the ConsultRecord
     */
    public String format(ConsultRecord record) {
        // Get all the members and then connect them into a string with "_"
        String result;

        // First Date of the ConsultRecord
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        result = dateFormat1.format(record.getDate());

        // Student
        result += "_" + record.getStudent().getName();
        result += "_" + record.getStudent().getStudentId();
        result += "_" + record.getStudent().getPhone();
        result += "_" + (record.getStudent().getGender() ? "女" : "男");
        result += "_" + record.getStudent().getDepartment();
        // Date of Birth
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        result += "_" + dateFormat2.format(record.getStudent().getBirthday());

        // Consulting Room
        result += "_" + String.valueOf(record.getConsultingRoom().getId());
        result += "_" + record.getConsultingRoom().getCampus();
        result += "_" + record.getConsultingRoom().getBuilding();
        result += "_" + record.getConsultingRoom().getRoomNum();

        // Consultant
        result += "_" + record.getConsultant().getName();
        result += "_" + record.getConsultant().getId();
        result += "_" + record.getConsultant().getPhone();
        result += "_" + record.getConsultant().getIntro();
        if (record.getConsultant() instanceof CollegeConsultant) {
            result += "_" + ((CollegeConsultant) record.getConsultant()).getSchool();
        } else {
            result += "_" + ((EnterpriseConsultant) record.getConsultant()).getCompany();
        }

        return result;
    }

    /**
     * Formats a list of ConsultRecord objects into a single string, with each record formatted
     * and separated by a newline character.
     *
     * @param records the list of ConsultRecord objects to be formatted
     * @return a string representation of the list of ConsultRecord objects, with each record
     *         formatted and separated by a newline character
     */
    public String format(List<ConsultRecord> records) {
        String result = "";
        for (ConsultRecord record : records) {
            result += format(record) + "\n";
        }
        return result;
    }
}
