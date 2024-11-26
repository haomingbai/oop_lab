package cn.edu.nwpu;

public class ConsultingRoom {
    private int id;
    private String campus;
    private String building;
    private String roomNum;

    public ConsultingRoom(int id, String campus, String building, String roomNum) {
        this.id = id;
        this.campus = campus;
        this.building = building;
        this.roomNum = roomNum;
    }

    public int getId() {
        return id;
    }

    public String getCampus() {
        return campus;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoomNum() {
        return roomNum;
    }
    
}
