package com.example.inventorymanager;

public class AddGoods {
    private int id;
    private String productName;
    private int quantity;
    private double price;
    private String supplierName;
    private String supplierLocation;

    // Constructor
    public AddGoods(int id, String productName, int quantity, double price, String supplierName, String supplierLocation) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.supplierName = supplierName;
        this.supplierLocation = supplierLocation;
    }

    // Getters and Setters
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }

    public void setSupplierLocation(String supplierLocation) {
        this.supplierLocation = supplierLocation;
    }
}

