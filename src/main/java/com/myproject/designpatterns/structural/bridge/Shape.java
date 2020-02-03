package com.myproject.designpatterns.structural.bridge;

public abstract class Shape  {
    private Color color;
    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();

}
