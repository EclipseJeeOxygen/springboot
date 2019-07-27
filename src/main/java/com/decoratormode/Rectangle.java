package com.decoratormode;

public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
