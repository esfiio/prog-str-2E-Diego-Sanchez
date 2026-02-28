module com.example.loginydashboard_java_diegosanchez {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.loginydashboard_java_diegosanchez to javafx.fxml;
    opens com.example.loginydashboard_java_diegosanchez.controllers to javafx.fxml;
    exports com.example.loginydashboard_java_diegosanchez;
}