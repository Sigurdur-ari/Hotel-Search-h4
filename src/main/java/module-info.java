module Hotel.Search {
    requires java.sql;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    exports software;
    opens software to javafx.fxml;
    exports software.objects;
    opens software.objects to javafx.fxml;
    exports software.ui;
    opens software.ui to javafx.fxml;
}
