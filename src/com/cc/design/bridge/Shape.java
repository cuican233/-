package com.cc.design.bridge;

/**
 * @author CC
 * @date 2023/5/22
 */
public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void setShape();
}

class Circle extends Shape{

    public Circle(Color color) {
        super(color);
        color.show();
    }

    @Override
    public void setShape() {
        System.out.println("设置为圆形");
    }
}
class Square extends Shape{

    public Square(Color color) {
        super(color);
        color.show();
    }

    @Override
    public void setShape() {
        System.out.println("设置为方形");
    }
}
interface Color{
    void show();
}

class Red implements Color{

    @Override
    public void show() {
        System.out.println("我是红色");
    }
}
class Blue implements Color{

    @Override
    public void show() {
        System.out.println("我是蓝色");
    }
}

class demo{
    public static void main(String[] args) {
        Circle redCircle = new Circle(new Red());
        redCircle.setShape();
        Square blueSquare = new Square(new Blue());
        blueSquare.setShape();
    }
}