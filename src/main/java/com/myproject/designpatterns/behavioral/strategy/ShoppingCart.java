package com.myproject.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateTotal() {
        int total = 0;
        for(Item item:items){
            total += item.getPrice()*item.getQty();
        }
        return total;
    }

    public void pay(PaymentStrategy strategy){
        int amount = calculateTotal();
        strategy.pay(amount);
    }
}
