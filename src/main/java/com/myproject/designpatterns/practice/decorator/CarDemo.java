package com.myproject.designpatterns.practice.decorator;

public class CarDemo {


      public static void main(String args[]) {

          Car basicCar = new BasicCar();
          basicCar.assemble();

          System.out.println("----------------------------");

          Car sportsCar = new SportsCar(new BasicCar());
          sportsCar.assemble();

          System.out.println("----------------------------");

          Car luxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
          luxuryCar.assemble();



      }
}
