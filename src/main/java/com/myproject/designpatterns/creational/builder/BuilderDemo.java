package com.myproject.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String args[]) {
        Computer computer= new Computer.ComputerBuilder("4Gb ram","1GB hdd").setBlueToothEnabled(true).build();
        System.out.println(computer.getHdd());
        System.out.println(computer.isGraphicsCard());
    }
}
