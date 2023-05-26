package com.cc.design.builder;

/**
 * @author CC
 * @date 2023/5/20
 */

//指挥者，指挥构建产品
public class Director {
    public void bulider(Builder builder){
        builder.buildA();
        builder.buildB();
    }
}

interface Builder{
    void buildA();
    void buildB();
    Product getProduct();
}

class ConcreteBuilder1 implements Builder{

    private Product product = new Product();
    @Override
    public void buildA() {
        product.setPartA("碳纤维做的");
    }

    @Override
    public void buildB() {
        product.setPartB("碳纤维做的");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class ConcreteBuilder2 implements Builder{

    private Product product = new Product();
    @Override
    public void buildA() {
        product.setPartA("金子做的");
    }

    @Override
    public void buildB() {
        product.setPartB("金子做的");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class Product{
    private String partA;

    private String partB;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void show(){
        System.out.println("我的组成部件：partA:"+partA+"，partB:"+partB);
    }
}
class demo{
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        director.bulider(concreteBuilder1);
        Product product1 = concreteBuilder1.getProduct();
        product1.show();
    }
}