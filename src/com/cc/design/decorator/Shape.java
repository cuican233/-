package com.cc.design.decorator;

/**
 * @author CC
 * @date 2023/5/23
 */
public interface Shape {
    void show();
}

class Rectangle implements Shape{

    @Override
    public void show() {
        System.out.println("矩形的show()方法被调用");
    }
}
class Circle implements Shape{

    @Override
    public void show() {
        System.out.println("圆形的show()方法被调用");
    }
}

class RedDecorator extends ShapeDecorator{

    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.show();
        setRedColor("红色");
    }
    public void setRedColor(String color){
        System.out.println("设置为红色");
    }
}
class BlueDecorator extends ShapeDecorator{

    public BlueDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.show();
        setBlueColor("蓝色");
    }
    public void setBlueColor(String color){
        System.out.println("设置为蓝色");
    }
}

class demo{
    public static void main(String[] args) {
        RedDecorator redDecorator = new RedDecorator(new Circle());
        redDecorator.draw();

        BlueDecorator blueDecorator = new BlueDecorator(new Rectangle());
        blueDecorator.draw();
    }
}
