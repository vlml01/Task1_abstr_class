module com.example.task1_abstr_class {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task1_abstr_class to javafx.fxml;
    exports com.example.task1_abstr_class;
}