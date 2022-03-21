module com.example.studentmenager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmenager to javafx.fxml;
    exports com.example.studentmenager;
}