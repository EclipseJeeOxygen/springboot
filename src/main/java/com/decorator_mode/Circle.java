package com.decorator_mode;

public class Circle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
