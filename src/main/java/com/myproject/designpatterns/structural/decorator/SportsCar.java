package com.myproject.designpatterns.structural.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
         super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.println("adding features of sports car");
    }
}
