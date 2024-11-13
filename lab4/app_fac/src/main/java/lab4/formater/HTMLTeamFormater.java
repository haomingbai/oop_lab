package lab4.formater;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;

import lab4.*;

public class HTMLTeamFormater implements TeamFormater {

    HTMLTeamFormater() {
    }

    public String formatTeam(Team team) {
        String result;
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        Element body = doc.body();

        body.appendElement("center").text("<h2>Team Information</h2>");
        body.append(team.getTeamId() + " " + team.getTeamName() + " " + team.getDepartment() + "<br>");
        body.append("creator[" + team.getCreator().getId() + " " + team.getCreator().getName()
                + team.getCreator().getPhoneNo() + team.getCreator().getEmail()
                + (team.getCreator().getGender() ? "女" : "男") + String.valueOf(team.getCreator().getGrade())
                + team.getCreator().getDepartment()
                + team.getCreator().getStudentNo()
                + "]<br>");

        // Append the students
        body.appendElement("h3").text("Student List");
        Element quote = body.appendElement("blockquote");

        for (Student student : team.getStudentList()) {
            quote.append(student.getId() + " " + student.getName() + " " + student.getPhoneNo() + " "
                    + student.getEmail()
                    + (student.getGender() ? "女" : "男") + String.valueOf(student.getGrade()) + student.getDepartment()
                    + student.getStudentNo() + "<br>");
        }

        // Append the teachers
        body.appendElement("h3").text("Teacher List");
        quote = body.appendElement("blockquote");

        for (Teacher teacher : team.getTeacherList()) {
            quote.append(
                    teacher.getId() + " " + teacher.getName() + " " + teacher.getPhoneNo() + " " + teacher.getEmail()
                            + teacher.getTeacherNo()
                            + teacher.getDepartment()
                            + teacher.getTeacherNo() + "<br>");
        }

        result = doc.outerHtml();
        return result;
    };
}
