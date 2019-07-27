package com.decoratormode;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(ShapeInterface shapeInterface) {
        super(shapeInterface);
    }

    @Override
    public void draw() {
        shapeInterface.draw();
        setRedBorder(shapeInterface);
    }

    private void setRedBorder(ShapeInterface shapeInterface){
        System.out.println("Border Color: Red");
    }

}
