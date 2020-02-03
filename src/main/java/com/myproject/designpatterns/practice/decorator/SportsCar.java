package com.myproject.designpatterns.practice.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding functinality of Sports Car.");
    }
}
