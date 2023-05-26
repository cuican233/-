package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
/**
 * @description:大众汽车
 */
public interface Car {

    /**
     * 接受访问者的访问
     * @param visitor 访问者对象
     */
    void accept(Visitor visitor);
}
