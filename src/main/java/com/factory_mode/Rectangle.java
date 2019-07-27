package com.factory_mode;

public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
