package com.myproject.designpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private String name;
    private String cvv;
    private String dateOfExpiry;
    private String cardNumber;

    public CreditCardPayment(String name,String cardNumber,String cvv,String dateOfExpiry){
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
        this.cardNumber = cardNumber;
    }

    public void pay(int amount){
        System.out.println("payed "+amount+" through credit card payment");
    }

}
