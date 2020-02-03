package com.myproject.designpatterns.creational.builder.practice;

import com.myproject.designpatterns.creational.builder.Computer;

public class BuilderDemo {

    public static void main(String args[]) {

       Computer computer = new Computer.ComputerBuilder("4gbram","8gb").setBlueToothEnabled(true).build();

        System.out.println(computer.getHdd());
        System.out.println(computer.getRam());
        System.out.println(computer.isBlueToothEnabled());
        System.out.println(computer.isGraphicsCard());


    }
}
