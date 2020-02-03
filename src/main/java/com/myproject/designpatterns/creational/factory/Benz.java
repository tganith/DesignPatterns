package com.myproject.designpatterns.creational.factory;

public class Benz implements Car {
    private String steering;
    private String engine;
    private String tyres;

    public Benz(String steering,String engine,String tyres) {
        this.engine = engine;
        this.steering = steering;
        this.tyres = tyres;
    }

    public String getSteering() {
        return this.steering;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getTyres() {
        return this.tyres;
    }



}
