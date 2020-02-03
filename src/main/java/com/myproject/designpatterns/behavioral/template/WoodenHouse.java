package com.myproject.designpatterns.behavioral.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildFlooring() {
        System.out.println("flooring with wooden");
    }

    @Override
    public void buildPillars() {
        System.out.println("flooring with pillars caoting wooden");
    }
}
