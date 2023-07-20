package com.example.inventorymanager;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AddGoodsController {

    @FXML
    private TextField productIdField;
    @FXML
    private ComboBox<String> productTypeComboBox;
    @FXML
    private TextField brandField;
    @FXML
    private TextField productNameField;
    @FXML
    private Button addButton;

    private void handleButtonAction()
    {
        String productId = productIdField.getText();
        String productType = productTypeComboBox.getValue();
        String brand = brandField.getText();
        String productName = productNameField.getText();

    }
}
