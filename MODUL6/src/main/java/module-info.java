module com.example.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.praktikum6 to javafx.fxml;
    exports com.example.praktikum6;
}