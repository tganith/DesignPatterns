package com.myproject.designpatterns.behavioral.strategy;

public class Item {

    private String itemCode;
    private int price;
    private int qty;

    public Item(String itemCode,int price,int qty){
        this.itemCode = itemCode;
        this.price = price;
        this.qty = qty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
