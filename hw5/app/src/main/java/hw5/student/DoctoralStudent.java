package hw5.student;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class DoctoralStudent extends GraduateStudent {
    String supervioser;
    String researchField;

    // Constructor
    public DoctoralStudent(String studentNumber, String studentName, boolean gender, long birthday, String academy, String supervisor, String researchField) {
        super(studentNumber, studentName, gender, birthday, academy, supervisor);
        this.researchField = researchField;
    }

    // Methods
    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getStudentInfo() {
        // Convert to xml
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("StudentInfo");
        root.addElement("studentNumber").addText(studentNumber);
        root.addElement("studentName").addText(studentName);
        root.addElement("gender").addText(gender ? "女" : "男");
        root.addElement("birthday").addText(String.valueOf(birthday));
        root.addElement("academy").addText(academy);
        root.addElement("supervisor").addText(supervisor); 
        root.addElement("researchField").addText(researchField);
        return document.asXML();
   }
}