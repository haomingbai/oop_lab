package cn.edu.nwpu;

import java.util.List;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.StringWriter;
import java.text.SimpleDateFormat;

public class XmlFormatter implements Formatter {
    /**
     * Formats a ConsultRecord object into an XML string representation.
     *
     * @param record the ConsultRecord object to be formatted
     * @return a formatted XML string representation of the ConsultRecord
     */
    @Override
    public String format(ConsultRecord record) {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("record");

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Element date = root.addElement("date");
        date.addText(dateFormat2.format(record.getDate()));

        // Add student
        Element student = root.addElement("student");
        student.addElement("name").addText(record.getStudent().getName());
        student.addElement("studentId").addText(record.getStudent().getStudentId());
        student.addElement("phone").addText(record.getStudent().getPhone());
        student.addElement("gender").addText((record.getStudent().getGender() ? "女" : "男"));
        student.addElement("department").addText(record.getStudent().getDepartment());
        student.addElement("birthday").addText(dateFormat1.format(record.getStudent().getBirthday()));

        // Add consulting room
        Element consultingRoom = root.addElement("consultingRoom");
        consultingRoom.addElement("id").addText(String.valueOf(String.valueOf(record.getConsultingRoom().getId())));
        consultingRoom.addElement("campus").addText(record.getConsultingRoom().getCampus());
        consultingRoom.addElement("building").addText(record.getConsultingRoom().getBuilding());
        consultingRoom.addElement("roomNum").addText(record.getConsultingRoom().getRoomNum());

        // Add consultant
        Element consultant = root.addElement("consultant");
        consultant.addElement("name").addText(record.getConsultant().getName());
        consultant.addElement("id").addText(record.getConsultant().getId());
        consultant.addElement("phone").addText(record.getConsultant().getPhone());
        consultant.addElement("intro").addText(record.getConsultant().getIntro());
        if (record.getConsultant() instanceof CollegeConsultant) {
            consultant.addElement("college").addText(((CollegeConsultant) record.getConsultant()).getSchool());
        } else {
            consultant.addElement("department").addText(((EnterpriseConsultant) record.getConsultant()).getCompany());

        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setIndentSize(2);

        StringWriter writer = new StringWriter();
        XMLWriter xmlWriter = new XMLWriter(writer, format);

        try {
            xmlWriter.write(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return writer.toString();
    }

    /**
     * Formats a list of ConsultRecord objects into an XML string.
     *
     * @param records the list of ConsultRecord objects to format
     * @return a formatted XML string representing the list of ConsultRecord objects
     */
    @Override
    public String format(List<ConsultRecord> records) {
        Document document = DocumentHelper.createDocument();
        Element recordsElement = document.addElement("records");

        for (ConsultRecord record : records) {
            Element root = recordsElement.addElement("record");
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Element date = root.addElement("date");
            date.addText(dateFormat2.format(record.getDate()));

            // Add student
            Element student = root.addElement("student");
            student.addElement("name").addText(record.getStudent().getName());
            student.addElement("studentId").addText(record.getStudent().getStudentId());
            student.addElement("phone").addText(record.getStudent().getPhone());
            student.addElement("gender").addText((record.getStudent().getGender() ? "女" : "男"));
            student.addElement("department").addText(record.getStudent().getDepartment());
            student.addElement("birthday").addText(dateFormat1.format(record.getStudent().getBirthday()));

            // Add consulting room
            Element consultingRoom = root.addElement("consultingRoom");
            consultingRoom.addElement("id").addText(String.valueOf(String.valueOf(record.getConsultingRoom().getId())));
            consultingRoom.addElement("campus").addText(record.getConsultingRoom().getCampus());
            consultingRoom.addElement("building").addText(record.getConsultingRoom().getBuilding());
            consultingRoom.addElement("roomNum").addText(record.getConsultingRoom().getRoomNum());

            // Add consultant
            Element consultant = root.addElement("consultant");
            consultant.addElement("name").addText(record.getConsultant().getName());
            consultant.addElement("id").addText(record.getConsultant().getId());
            consultant.addElement("phone").addText(record.getConsultant().getPhone());
            consultant.addElement("intro").addText(record.getConsultant().getIntro());
            if (record.getConsultant() instanceof CollegeConsultant) {
                consultant.addElement("college").addText(((CollegeConsultant) record.getConsultant()).getSchool());
            } else {
                consultant.addElement("department")
                        .addText(((EnterpriseConsultant) record.getConsultant()).getCompany());

            }
        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setIndentSize(2);

        StringWriter writer = new StringWriter();
        XMLWriter xmlWriter = new XMLWriter(writer, format);

        try {
            xmlWriter.write(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return writer.toString();
    }

}
