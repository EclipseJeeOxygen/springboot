package com.factorymode;

public class Square implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
