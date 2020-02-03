package com.myproject.designpatterns.creational.singleton;

public class SingletonClone implements Cloneable{

    private static SingletonClone singletonClone;

    private SingletonClone(){}

    public static SingletonClone getInstance(){
        if(singletonClone == null){
            singletonClone = new SingletonClone();
        }
        return singletonClone;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
