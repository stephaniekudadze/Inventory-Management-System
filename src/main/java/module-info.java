module com.example.inventorymanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inventorymanager to javafx.fxml;
    exports com.example.inventorymanager;
}