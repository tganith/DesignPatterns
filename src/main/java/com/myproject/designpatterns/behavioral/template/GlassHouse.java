package com.myproject.designpatterns.behavioral.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildFlooring() {
        System.out.println("flooring with glass");
    }

    @Override
    public void buildPillars() {
        System.out.println("flooring with pillars caoting glass");
    }
}
