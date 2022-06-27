module com.app.sample {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.app.sample to javafx.fxml;
    exports com.app.sample;
}
