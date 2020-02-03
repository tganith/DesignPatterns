package com.myproject.designpatterns.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy {

    private String name;
    private String email;

    public PaypalPayment(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void pay(int amount){
        System.out.println("payed "+amount+" through paypal payment");
    }

}
