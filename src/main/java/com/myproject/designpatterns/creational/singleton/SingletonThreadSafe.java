package com.myproject.designpatterns.creational.singleton;

public class SingletonThreadSafe {
    private static  SingletonThreadSafe singleton;

    private SingletonThreadSafe(){
    }

    public static  synchronized SingletonThreadSafe getInstance(){
        if(singleton ==  null){
            singleton = new SingletonThreadSafe();
        }
        return singleton;
    }

}