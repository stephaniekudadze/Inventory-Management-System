package com.example.inventorymanager;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewVendorsController {
    @FXML
    private TableView<Vendor> vendorTable;

    @FXML
    private TableColumn<Vendor, Integer> vendorIDColumn;

    @FXML
    private TableColumn<Vendor, String> vendorNameColumn;

    @FXML
    private TableColumn<Vendor, String> contactPersonColumn;

    @FXML
    private TableColumn<Vendor, String> emailColumn;

    @FXML
    private TableColumn<Vendor, String> phoneColumn;


    public void initializeVendors()
    {
        // Bind data from database to the TableView
    }




}
