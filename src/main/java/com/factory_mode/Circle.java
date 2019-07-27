package com.factory_mode;


public class Circle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
