package com.example.inventorymanager;

public class ViewGoods {
    private int goodsID;
    private String goodsName;
    private int quantity;
    private double price;
    private String supplier;



    public ViewGoods()
    {

    }

    public ViewGoods(int goodsID, String goodsName, int quantity, double price, String supplier)
    {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
    }

    public void setGoodsID(int goodsID)
    {
        this.goodsID = goodsID;
    }

    public String getGoodsName()
    {
        return goodsName;
    }

    public void setGoodsName(String goodsName)
    {
        this.goodsName = goodsName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity()
    {
        this.quantity = quantity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getSupplier()
    {
        return supplier;
    }

    public void setSupplier(String supplier)
    {
        this.supplier = supplier;
    }

    public String toString()
    {
        return "Goods [ID=" + goodsID +
                ", Name=" + goodsName +
                ", Quantity=" + quantity +
                ", Supplier=" + supplier + "]";
    }
}

