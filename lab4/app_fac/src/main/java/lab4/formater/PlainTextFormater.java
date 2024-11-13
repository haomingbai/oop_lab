package lab4.formater;

import lab4.*;

public class PlainTextFormater implements TeamFormater {

    PlainTextFormater() {
    }

    public String formatTeam(Team team) {
        String result = new String();
        result += "Team{\n";

        // Basic info
        result += "\t teamId: " + team.getTeamId() + "\n";
        result += "\t teamName: " + team.getTeamName() + "\n";
        result += "\t department: " + team.getDepartment() + "\n";

        // Creator
        result += "\t creator{ \n";
        result += "\t\t id: " + team.getCreator().getId() + "\n";
        result += "\t\t name: " + team.getCreator().getName() + "\n";
        result += "\t\t phoneNo: " + team.getCreator().getPhoneNo() + "\n";
        result += "\t\t email: " + team.getCreator().getEmail() + "\n";
        result += "\t\t studentNo: " + team.getCreator().getStudentNo() + "\n";
        result += "\t\t gender: " + (team.getCreator().getGender() ? "女" : "男") + "\n";
        result += "\t\t grade: " + team.getCreator().getGrade() + "\n";
        result += "\t\t department: " + team.getCreator().getDepartment() + "\n";
        result += "\t }\n";

        // Student list
        result += "\t studentList{ \n";
        for (Student student : team.getStudentList()) {
            result += "\t\t student{ \n";
            result += "\t\t\t id: " + student.getId() + "\n";
            result += "\t\t\t name: " + student.getName() + "\n";
            result += "\t\t\t phoneNo: " + student.getPhoneNo() + "\n";
            result += "\t\t\t email: " + student.getEmail() + "\n";
            result += "\t\t\t studentNo: " + student.getStudentNo() + "\n";
            result += "\t\t\t gender: " + (student.getGender() ? "女" : "男") + "\n";
            result += "\t\t\t grade: " + student.getGrade() + "\n";
            result += "\t\t\t department: " + student.getDepartment() + "\n";
            result += "\t\t }\n";
        }
        result += "\t }\n";

        // Teacher list
        result += "\t teacherList{ \n";
        for (Teacher teacher : team.getTeacherList()) {
            result += "\t\t teacher{ \n";
            result += "\t\t\t id: " + teacher.getId() + "\n";
            result += "\t\t\t name: " + teacher.getName() + "\n";
            result += "\t\t\t phoneNo: " + teacher.getPhoneNo() + "\n";
            result += "\t\t\t email: " + teacher.getEmail() + "\n";
            result += "\t\t\t teacherNo: " + teacher.getTeacherNo() + "\n";
            result += "\t\t\t department: " + teacher.getDepartment() + "\n";
            result += "\t\t }\n";
        }
        result += "\t }\n";

        // End
        result += "}";

        return result;
    }
}
