module com.example.cobalab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cobalab6 to javafx.fxml;
    exports com.example.cobalab6;
}