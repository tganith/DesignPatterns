package com.myproject.designpatterns.structural.bridge;

public class Traingle extends Shape {

    private Color color;

    Traingle(Color c){
      super(c);
      this.color = c;
    }

    @Override
    public void applyColor() {
        System.out.print("Traingle filled with color ");
        color.applyColor();
    }
}
