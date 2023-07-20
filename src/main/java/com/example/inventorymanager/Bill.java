package com.example.inventorymanager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bill<Customer, PurchasedItem> {
    private String billID;
    private LocalDate date;
    private Customer customer;


    public Bill(String billID, LocalDate date, Customer customer) {
        this.billID = billID;
        this.date = date;
        this.customer = customer;

    }

    public String getBillNumber() {
        return billID;
    }

    public void setBillNumber(String billNumber) {
        this.billID = billNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }




}

