module com.bmt.th2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bmt.th2 to javafx.fxml;
    exports com.bmt.th2;
}
