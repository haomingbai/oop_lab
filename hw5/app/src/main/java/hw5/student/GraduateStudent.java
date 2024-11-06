package hw5.student;

import com.alibaba.fastjson2.*;

public class GraduateStudent extends StudentInfo {
    String supervisor;

    // Constructor
    public GraduateStudent(String studentNumber, String studentName, boolean gender, long birthday, String academy, String supervisor) {
        super(studentNumber, studentName, gender, birthday, academy);
        this.supervisor = supervisor;
    }

    // Methods
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getStudentInfo() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("studentNumber", studentNumber);
        jsonObject.put("studentName", studentName);
        jsonObject.put("gender", gender);
        jsonObject.put("birthday", birthday);
        jsonObject.put("academy", academy);
        jsonObject.put("supervisor", supervisor);
        return JSON.toJSONString(jsonObject);
    }
    
}
