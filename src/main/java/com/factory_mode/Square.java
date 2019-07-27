package com.factory_mode;

public class Square implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
