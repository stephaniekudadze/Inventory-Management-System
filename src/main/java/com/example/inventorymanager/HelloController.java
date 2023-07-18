package com.example.inventorymanager;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stack<String> goodsStack;
    private HashMap<String, Integer> vendorGoodsCountMap;
    private Queue<String> issuedGoodsQueue;
    private List<String> vendorsList;



    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToViewVendors(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewVendors.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    public void switchToAddGoods(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddGoods.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToIssueGoods(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IssueGoods.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void InventoryController() {
        goodsStack = new Stack<>();
        vendorGoodsCountMap = new HashMap<>();
        issuedGoodsQueue = new LinkedList<>();
        vendorsList = new ArrayList<>();
    }

    // View Vendors
    public List<String> getViewVendors() {
        return vendorsList;
    }

    // Add Goods
    public void addGoods(String goods) {
        goodsStack.push(goods);

        // Update vendor-goods count
        vendorGoodsCountMap.put(goods, vendorGoodsCountMap.getOrDefault(goods, 0) + 1);
    }

    // Issue Goods
    public String issueGoods() {
        if (!goodsStack.isEmpty()) {
            String goods = goodsStack.pop();

            // Add issued goods to the queue
            issuedGoodsQueue.add(goods);

            // Update vendor-goods count
            vendorGoodsCountMap.put(goods, vendorGoodsCountMap.get(goods) - 1);

            return goods;
        }
        return null;
    }

    // Search Goods
    public boolean searchGoods(String goods) {
        return goodsStack.contains(goods);
    }

    // Sort Goods
    public List<String> sortGoods() {
        List<String> sortedGoodsList = new ArrayList<>(goodsStack);
        Collections.sort(sortedGoodsList);
        return sortedGoodsList;
    }
}

