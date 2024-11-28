package cn.edu.nwpu.lab6;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ChoiceBox;
import javafx.stage.FileChooser;
import cn.edu.nwpu.oopd.lab05.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class HelloController {
    // Members
    List<Team> teams = new ArrayList<>();
    int index = 0;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Button displayHtml;

    @FXML
    private Button displayJson;

    @FXML
    private Button displayXml;

    @FXML
    private Button loadFile;

    @FXML
    private TextArea textArea;

    @FXML
    void onDisplayHtmlAction(ActionEvent event) {
        // System.out.println(event);
        String choice = choiceBox.getValue();
        // System.out.println(choice);
        var team = findTeam(choice);
        Document doc = Document.createShell("");

        // 设置文档标题
        doc.title("Team Information");

        // 创建表格元素
        Element table = doc.appendElement("table");
        table.attr("border", "1");

        // 添加表头
        Element header = table.appendElement("thead").appendElement("tr");
        header.appendElement("th").text("Field");
        header.appendElement("th").text("Value");

        // 添加团队信息
        Element teamBody = table.appendElement("tbody");
        teamBody.appendElement("tr").appendElement("td").text("Team ID").appendElement("td").text(team.getTeamId());
        teamBody.appendElement("tr").appendElement("td").text("Team Name").appendElement("td").text(team.getTeamName());
        teamBody.appendElement("tr").appendElement("td").text("Department").appendElement("td").text(team.getDepartment());

        // 添加 Creator 信息
        Student creator = team.getCreator();
        teamBody.appendElement("tr").appendElement("td").text("Creator ID").appendElement("td").text(creator.getId());
        teamBody.appendElement("tr").appendElement("td").text("Creator Name").appendElement("td").text(creator.getName());
        teamBody.appendElement("tr").appendElement("td").text("Creator Phone No").appendElement("td").text(creator.getPhoneNo());
        teamBody.appendElement("tr").appendElement("td").text("Creator Email").appendElement("td").text(creator.getEmail());
        teamBody.appendElement("tr").appendElement("td").text("Creator Student No").appendElement("td").text(creator.getStudentNo());
        teamBody.appendElement("tr").appendElement("td").text("Creator Gender").appendElement("td").text(creator.getGender() ? "Male" : "Female");
        teamBody.appendElement("tr").appendElement("td").text("Creator Grade").appendElement("td").text(creator.getGrade());
        teamBody.appendElement("tr").appendElement("td").text("Creator Department").appendElement("td").text(creator.getDepartment());

        // 添加学生列表
        if (!team.getStudentList().isEmpty()) {
            for (Student student : team.getStudentList()) {
                teamBody.appendElement("tr").appendElement("td").text("Student ID").appendElement("td").text(student.getId());
                teamBody.appendElement("tr").appendElement("td").text("Student Name").appendElement("td").text(student.getName());
                teamBody.appendElement("tr").appendElement("td").text("Student Phone No").appendElement("td").text(student.getPhoneNo());
                teamBody.appendElement("tr").appendElement("td").text("Student Email").appendElement("td").text(student.getEmail());
                teamBody.appendElement("tr").appendElement("td").text("Student No").appendElement("td").text(student.getStudentNo());
                teamBody.appendElement("tr").appendElement("td").text("Student Gender").appendElement("td").text(student.getGender() ? "Male" : "Female");
                teamBody.appendElement("tr").appendElement("td").text("Student Grade").appendElement("td").text(student.getGrade());
                teamBody.appendElement("tr").appendElement("td").text("Student Department").appendElement("td").text(student.getDepartment());
            }
        }

        // 添加教师列表
        if (!team.getTeacherList().isEmpty()) {
            for (Teacher teacher : team.getTeacherList()) {
                teamBody.appendElement("tr").appendElement("td").text("Teacher ID").appendElement("td").text(teacher.getId());
                teamBody.appendElement("tr").appendElement("td").text("Teacher Name").appendElement("td").text(teacher.getName());
                teamBody.appendElement("tr").appendElement("td").text("Teacher Phone No").appendElement("td").text(teacher.getPhoneNo());
                teamBody.appendElement("tr").appendElement("td").text("Teacher Email").appendElement("td").text(teacher.getEmail());
                teamBody.appendElement("tr").appendElement("td").text("Teacher No").appendElement("td").text(teacher.getTeacherNo());
                teamBody.appendElement("tr").appendElement("td").text("Teacher Department").appendElement("td").text(teacher.getDepartment());
            }
        }
        textArea.setText(doc.outerHtml());
    }

    @FXML
    void onDisplayJsonAction(ActionEvent event) {
        System.out.println(event);
        String choice = choiceBox.getValue();
        var team = findTeam(choice);

        String json = JSON.toJSONString(team, JSONWriter.Feature.PrettyFormat);

        textArea.setText(json);
    }

    @FXML
    void onDisplayXmlAction(ActionEvent event) {
        String choice = choiceBox.getValue();
        var team = findTeam(choice);

        // 创建一个 XmlMapper 实例
        XmlMapper xmlMapper = new XmlMapper();

        // 将 Team 对象转换为 XML 字符串
        try {
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(team);
            textArea.setText(xml);
        } catch (Exception exception) {
            System.err.println(exception);
        }
    }

    @FXML
    void onLoadFileAction(ActionEvent event) {
        System.out.println(event);
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            ObservableList<String> list = FXCollections.observableArrayList();
            choiceBox.setItems(list);
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.equals("")) {
                    continue;
                }
                // Split the string by '_'
                String[] parts = line.split("_");

                // Create result lists
                String[] team = null;
                String[] creator = null;
                List<String[]> studentList = new ArrayList<>();
                List<String[]> teacherList = new ArrayList<>();

                int i = 0;
                while (i < parts.length) {
                    if (parts[i].equals("Team")) {
                        // Extract Team information (next 3 elements)
                        if (i + 3 < parts.length) {
                            team = new String[]{parts[i + 1], parts[i + 2], parts[i + 3]};
                            i += 4; // Move past the Team information
                        } else {
                            i++; // If Team data is incomplete, skip
                        }
                    } else if (parts[i].equals("Creator")) {
                        // Extract Creator information (next 8 elements)
                        if (i + 8 < parts.length) {
                            creator = new String[]{parts[i + 1], parts[i + 2], parts[i + 3], parts[i + 4], parts[i + 5], parts[i + 6], parts[i + 7], parts[i + 8]};
                            i += 9; // Move past the Creator information
                        } else {
                            i++; // If Creator data is incomplete, skip
                        }
                    } else if (parts[i].equals("Student")) {
                        // Extract Student information (next 8 elements) if available
                        if (i + 8 < parts.length) {
                            String[] student = new String[8];
                            student[0] = parts[i + 1];
                            student[1] = parts[i + 2];
                            student[2] = parts[i + 3];
                            student[3] = parts[i + 4];
                            student[4] = parts[i + 5];
                            student[5] = parts[i + 6];
                            student[6] = parts[i + 7];
                            student[7] = parts[i + 8];
                            studentList.add(student);
                            i += 9;
                        } else {
                            i++; // If Student data is incomplete or absent, skip
                        }
                    } else if (parts[i].equals("Teacher")) {
                        // Extract Teacher information (next 6 elements) if available
                        if (i + 6 < parts.length) {
                            String[] teacher = new String[6];
                            teacher[0] = parts[i + 1];
                            teacher[1] = parts[i + 2];
                            teacher[2] = parts[i + 3];
                            teacher[3] = parts[i + 4];
                            teacher[4] = parts[i + 5];
                            teacher[5] = parts[i + 6];
                            teacherList.add(teacher);
                            i += 7; // Move past the Teacher information
                        } else {
                            i++; // If Teacher data is incomplete or absent, skip
                        }
                    } else {
                        i++; // In case of unexpected format, just move to the next part
                    }
                }
                Student creatorToProcess = new Student(creator[0], creator[1], creator[2],
                        creator[3], creator[4], creator[5].equals("女"), creator[6], creator[7]);
                Team teamToProcess = new Team(team[0], team[1], team[2], creatorToProcess);
                teams.add(teamToProcess);
                list.add(teamToProcess.getTeamId());
                for (var studentInfo : studentList) {
                    Student student = new Student(studentInfo[0], studentInfo[1], studentInfo[2],
                            studentInfo[3], studentInfo[4], studentInfo[5].equals("女"), studentInfo[6], studentInfo[7]);
                    teamToProcess.addStudent(student);
                }
                for (var teacherInfo : teacherList) {
                    Teacher teacher = new Teacher(teacherInfo[0], teacherInfo[1], teacherInfo[2],
                            teacherInfo[3], teacherInfo[4], teacherInfo[5]);
                    teamToProcess.addTeacher(teacher);
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    // Methods
    private Team findTeam(String teamId) {
        for (Team team : teams) {
            if (team.getTeamId().equals(teamId)) {
                return team;
            }
        }
        return null;
    }
}