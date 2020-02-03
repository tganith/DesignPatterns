package com.myproject.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDemo {

   public static void main(String args[]){

       ShoppingCart cart = new ShoppingCart();
       cart.addItem(new Item("mobile",1000,1));
       cart.addItem(new Item("books",200,4));

       cart.pay(new CreditCardPayment("ganitha","1234","123","20190912") );
       cart.pay(new NetBankingPayment("ganitha","pwd") );
       cart.pay(new PaypalPayment("ganitha","ganitha@gmail.com") );

   }

}
