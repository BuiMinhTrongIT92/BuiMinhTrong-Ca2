module com.bmt.buiminhtrong.ca2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bmt.buiminhtrong.ca2 to javafx.fxml;
    exports com.bmt.buiminhtrong.ca2;
}
