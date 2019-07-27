package com.decoratormode;
/**
 * @Author lujiaming
 * @Date 2019/7/27
 * @Description 实现了 Shape 接口的抽象装饰类
 **/
public abstract class ShapeDecorator implements ShapeInterface {

    protected ShapeInterface shapeInterface;

    public ShapeDecorator(ShapeInterface shapeInterface){
        this.shapeInterface = shapeInterface;
    }

    @Override
    public void draw() {
        shapeInterface.draw();
    }
}
