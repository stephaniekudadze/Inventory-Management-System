package com.example.inventorymanager;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBillsController {
    private TableView<Bill> billTable;
    @FXML
    private TableColumn<Bill, Integer> billIDColumn;
    @FXML
    private TableColumn<Bill, String> customerNameColumn;
    @FXML
    private TableColumn<Bill, String> dateColumn;
    @FXML
    private TableColumn<Bill, Double> totalAmountColumn;

    public void initializeBill()
    {
        // Fetch data from database
    }


}
