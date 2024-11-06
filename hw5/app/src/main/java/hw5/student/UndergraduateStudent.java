package hw5.student;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class UndergraduateStudent extends StudentInfo {
    String tutor;

    // Constructor
    public UndergraduateStudent(String studentNumber, String studentName, boolean gender, long birthday, String academy,
            String tutor) {
        super(studentNumber, studentName, gender, birthday, academy);
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getStudentInfo() {
        String res = this.getStudentNumber() + "_" + this.getStudentName() + "_" + (this.getGender() ? "女" : "男") + "_"
                + this.getBirthday() + "_" + this.getAcademy() + "_" + this.tutor;
        return res;
    }
}
