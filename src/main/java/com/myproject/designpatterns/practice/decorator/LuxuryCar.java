package com.myproject.designpatterns.practice.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding functinality of Luxury Car.");
    }
}
