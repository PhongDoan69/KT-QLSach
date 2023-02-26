module com.mycompany.thuvien {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.thuvien to javafx.fxml;
    exports com.mycompany.thuvien;
}
