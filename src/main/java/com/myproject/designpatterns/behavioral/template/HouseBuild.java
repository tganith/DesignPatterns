package com.myproject.designpatterns.behavioral.template;

public class HouseBuild {

    public static void main(String args[]) {
        HouseTemplate template = new WoodenHouse();
        template.buildHouse();

        template = new GlassHouse();
        template.buildHouse();
    }
}
