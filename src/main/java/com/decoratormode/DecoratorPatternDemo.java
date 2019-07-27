package com.decoratormode;
/**
 * @Author lujiaming
 * @Date 2019/7/27
 * @Description 装饰器模式
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        ShapeInterface circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
