package com.myproject.designpatterns.creational.factory;

public class CarDemo {

    public static void main(String args[]) {
        Car maruthi = CarFactory.getCar("maruthi","power","fiat engine","mrf");
        System.out.println(maruthi.getEngine());
    }
}
