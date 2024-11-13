package lab4;

import java.io.StringWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XMLTeamFormater implements TeamFormater {
    public String formatTeam(Team team) {
        Document document = DocumentHelper.createDocument();

        Element root = document.addElement("Team");

        root.addAttribute("teamId", team.getTeamId());
        root.addAttribute("teamName", team.getTeamName());
        root.addAttribute("department", team.getDepartment());

        Element creator = root.addElement("Creator");
        creator.addAttribute("id", team.getCreator().getId());
        creator.addAttribute("name", team.getCreator().getName());
        creator.addAttribute("phoneNo", team.getCreator().getPhoneNo());
        creator.addAttribute("email", team.getCreator().getEmail());
        creator.addAttribute("studentNo", team.getCreator().getStudentNo());
        creator.addAttribute("gender", (team.getCreator().getGender() ? "女" : "男"));
        creator.addAttribute("grade", String.valueOf(team.getCreator().getGrade()));
        creator.addAttribute("department", team.getCreator().getDepartment());

        // Append the students
        Element studentList = root.addElement("StudentList");
        for (Student student : team.getStudentList()) {
            Element studentElement = studentList.addElement("Student");
            studentElement.addAttribute("id", student.getId());
            studentElement.addAttribute("name", student.getName());
            studentElement.addAttribute("phoneNo", student.getPhoneNo());
            studentElement.addAttribute("email", student.getEmail());
            studentElement.addAttribute("studentNo", student.getStudentNo());
            studentElement.addAttribute("gender", (student.getGender() ? "女" : "男"));
            studentElement.addAttribute("grade", String.valueOf(student.getGrade()));
            studentElement.addAttribute("department", student.getDepartment());
        }

        // Append the teachers
        Element teacherList = root.addElement("TeacherList");
        for (Teacher teacher : team.getTeacherList()) {
            Element teacherElement = teacherList.addElement("Teacher");
            teacherElement.addAttribute("id", teacher.getId());
            teacherElement.addAttribute("name", teacher.getName());
            teacherElement.addAttribute("phoneNo", teacher.getPhoneNo());
            teacherElement.addAttribute("email", teacher.getEmail());
            teacherElement.addAttribute("teacherNo", teacher.getTeacherNo());
            teacherElement.addAttribute("department", teacher.getDepartment());
        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setIndentSize(2); // 设置缩进为2个空格

        // 使用StringWriter将XML写入内存
        StringWriter writer = new StringWriter();
        XMLWriter xmlWriter = new XMLWriter(writer, format);

        try {
            // 将格式化后的XML输出到writer中
            xmlWriter.write(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 返回格式化后的XML字符串
        return writer.toString();

    }
}
