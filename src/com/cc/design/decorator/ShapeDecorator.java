package com.cc.design.decorator;

/**
 * @author CC
 * @date 2023/5/23
 */
public abstract class ShapeDecorator {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public abstract void draw();
}
