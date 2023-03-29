module com.example.pendu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.pendu to javafx.fxml;
    exports com.example.pendu;
    exports Controller;
    opens Controller to javafx.fxml;
}