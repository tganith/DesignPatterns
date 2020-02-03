package com.myproject.designpatterns.creational.factory;

public class CarFactory {
    public static Car getCar(String type,String steering,String engine,String tyres ){

        if(type.equalsIgnoreCase("Benz")){
            return new Benz(steering, engine, tyres);
        } else if(type.equalsIgnoreCase("Audi")){
            return new Audi(steering, engine, tyres);
        } else if(type.equalsIgnoreCase("Maruthi")){
            return new Maruthi(steering, engine, tyres);
        }
        return null;
    }
}
