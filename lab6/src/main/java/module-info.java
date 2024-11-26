module cn.edu.nwpu.lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cn.edu.nwpu.lab6 to javafx.fxml;
    exports cn.edu.nwpu.lab6;
}