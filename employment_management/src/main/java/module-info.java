module employment_management_system {
    requires javafx.controls;
    requires javafx.fxml;

    opens employment_management_system to javafx.fxml;
    exports employment_management_system;
}
