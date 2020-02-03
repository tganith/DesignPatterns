package com.myproject.designpatterns.behavioral.strategy;

public class NetBankingPayment implements PaymentStrategy {

    private String userName;
    private String password;

    public NetBankingPayment(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void pay(int amount){
        System.out.println("payed "+amount+" through net banking");
    }

}
