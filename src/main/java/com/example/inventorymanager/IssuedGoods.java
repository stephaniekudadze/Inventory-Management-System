package com.example.inventorymanager;

import java.time.LocalDate;


import java.time.LocalDate;

public class IssuedGoods {

    public IssuedGoods(int id, String productName, int quantity, String issuedTo) {
    }
    private int id;
    private String productName;
    private int quantity;
    private String recipient;
    private LocalDate date;

    // Constructor
    public IssuedGoods(int id, String productName, int quantity, String recipient, LocalDate date) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.recipient = recipient;
        this.date = date;
    }

    // Getters and Setters (you can generate them automatically in most IDEs)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}