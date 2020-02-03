package com.myproject.designpatterns.creational.singleton;

public class SingletonStaticBlock {
    private static  SingletonStaticBlock singleton;

    private SingletonStaticBlock(){
    }

    public static SingletonStaticBlock getInstance(){
        return singleton;
    }

    static{
        singleton = new SingletonStaticBlock();
    }

}