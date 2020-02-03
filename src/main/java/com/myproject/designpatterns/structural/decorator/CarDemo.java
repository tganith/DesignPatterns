package com.myproject.designpatterns.structural.decorator;

public class CarDemo {

    public static void main(String args[]) {

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("-------------------------------");

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        System.out.println("-------------------------------");

        Car basicCar = new BasicCar();
        basicCar.assemble();


    }
}
