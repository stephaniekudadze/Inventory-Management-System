package com.example.inventorymanager;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



public class ViewGoodsController {
    @FXML
    private TableView<ViewGoods> goodsTable;
    @FXML
    private TableColumn<ViewGoods, Integer> goodsIDColumn;
    @FXML
    private TableColumn<ViewGoods, String> goodsNameColumn;
    @FXML
    private TableColumn<ViewGoods, String> priceColumn;
    @FXML
    private TableColumn<ViewGoods, String> supplierColumn;

    public void initializeGoods()
    {

    }

}
