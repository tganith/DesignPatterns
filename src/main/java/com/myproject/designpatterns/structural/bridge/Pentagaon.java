package com.myproject.designpatterns.structural.bridge;

public class Pentagaon extends Shape {

    private Color color;

     Pentagaon(Color c){
         super(c);
         this.color = c;
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagaon filled with color ");
        color.applyColor();
    }
}
