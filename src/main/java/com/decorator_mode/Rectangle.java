package com.decorator_mode;

public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
