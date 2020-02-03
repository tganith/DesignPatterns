package com.myproject.designpatterns.creational.singleton;

public class SingletonThreadSafeDouble {
    private static SingletonThreadSafeDouble singleton;

    private SingletonThreadSafeDouble(){
    }

    public static  SingletonThreadSafeDouble getInstance(){
        if(singleton ==  null){
            synchronized (SingletonThreadSafeDouble.class){
                if(singleton == null){
                    singleton = new SingletonThreadSafeDouble();
                }
            }
        }
        return singleton;
    }

}