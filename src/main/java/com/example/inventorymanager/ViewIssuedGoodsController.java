package com.example.inventorymanager;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import static java.util.Collections.addAll;

public class ViewIssuedGoodsController {
    @FXML
    private TableView<IssuedGoods> issueGoodsTable;

    @FXML
    private TableColumn<IssuedGoods, String> goodsNameColumn;
    @FXML
    private TableColumn<IssuedGoods, Integer> quantityColumn;
    @FXML
    private TableColumn<IssuedGoods, String> dateOfIssuanceColumn;

    public void initialize()
    {

    }


}
