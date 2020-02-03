package com.myproject.designpatterns.creational.singleton;

public class SingletonEarly {
    private static final SingletonEarly singletone = new SingletonEarly();

    private SingletonEarly(){
    }

    public static SingletonEarly getInstance(){
        return singletone;
    }

}