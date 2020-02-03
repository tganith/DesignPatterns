package com.myproject.designpatterns.structural.bridge;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

public class BridgeDemo {

    public static void main(String args[]) {
        Shape traningleShape  = new Traingle(new Red());
         traningleShape.applyColor();

       Shape  pentagaonShape = new Pentagaon(new Green());
        pentagaonShape.applyColor();
    }
}
