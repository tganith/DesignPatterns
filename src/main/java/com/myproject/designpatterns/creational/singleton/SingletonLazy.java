package com.myproject.designpatterns.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if(singleton ==  null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }

}