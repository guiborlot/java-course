module com.example.javafx6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx6 to javafx.fxml;
    exports com.example.javafx6;
}