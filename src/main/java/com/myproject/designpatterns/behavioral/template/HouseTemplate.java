package com.myproject.designpatterns.behavioral.template;

public abstract class HouseTemplate {

    public final void buildHouse() {

        buildFoundation();
        buildFlooring();
        buildWindows();
        buildPillars();
        System.out.println("built house ");
        System.out.println("----------------------------");
    }

    private void buildWindows() {
        System.out.println("build windows with glasses");
    }

    private void buildFoundation() {
        System.out.println("build foundation with iron and cement and sand");
    }

    public abstract void buildFlooring() ;
    public abstract void buildPillars();
}
