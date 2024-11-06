package hw5.student;

public abstract class StudentInfo{
    String studentNumber;
    String studentName;
    boolean gender;
    long birthday;
    String academy;
    
    // Constructor
    public StudentInfo(String studentNumber, String studentName, boolean gender, long birthday, String academy) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
        this.birthday = birthday;
        this.academy = academy;
    }

    // Methods
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public abstract String getStudentInfo();

    public int compareTo(StudentInfo student) {
        // Compare their age by birthday
        if (this.birthday > student.birthday) {
            return -1;
        } else if (this.birthday < student.birthday) {
            return 1;
        } else {
            return 0;
        }
    }
}
