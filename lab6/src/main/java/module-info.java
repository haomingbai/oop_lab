module cn.edu.nwpu.lab6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lab05;
    requires org.jsoup;
    requires com.fasterxml.jackson.dataformat.xml;
    requires com.fasterxml.jackson.databind;
    requires com.alibaba.fastjson2;

    opens cn.edu.nwpu.lab6 to javafx.fxml;
    exports cn.edu.nwpu.lab6;
}