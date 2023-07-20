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
    public void switchToViewGoods(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewGoods.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToViewBills(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewBills.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToViewIssuedGoods(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewIssuedGoods.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}

