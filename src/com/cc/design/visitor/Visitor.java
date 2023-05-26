package com.cc.design.visitor;

import java.util.Map;

/**
 * @author CC
 * @date 2023/5/22
 */
public interface Visitor {
    double visitKeyboard(Keyboard keyboard);
    double visitMouse(Mouse mouse);

}
class VIPvisitor implements Visitor{

    @Override
    public double visitKeyboard(Keyboard keyboard) {
        return keyboard.price*0.8;
    }

    @Override
    public double visitMouse(Mouse mouse) {
        return mouse.price*0.8;
    }
}
class Commonvisitor implements Visitor{

    @Override
    public double visitKeyboard(Keyboard keyboard) {
        return keyboard.price*0.9;
    }

    @Override
    public double visitMouse(Mouse mouse) {
        return mouse.price*0.9;
    }
}

abstract class ComputerPart{
    //电脑组件抽象父类，被访问者，提供接受访问者的方法

    protected String name;
    protected double price;

    public ComputerPart(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract double accept(Visitor visitor);
}

class Keyboard extends ComputerPart{

    public Keyboard(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitKeyboard(this);
    }
}
class Mouse extends ComputerPart{

    public Mouse(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitMouse(this);
    }
}
class Computer{
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public double getPrice(Visitor visitor){
        return keyboard.accept(visitor)+mouse.accept(visitor);
    }
}
class demo{
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("cherry", 300);
        Mouse mouse = new Mouse("logic", 200);

        Computer computer = new Computer(keyboard, mouse);
        System.out.println(computer.getPrice(new VIPvisitor()));
        System.out.println(computer.getPrice(new Commonvisitor()));
    }
}