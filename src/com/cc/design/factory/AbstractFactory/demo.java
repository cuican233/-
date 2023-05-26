package com.cc.design.factory.AbstractFactory;

/**
 * @author CC
 * @date 2023/5/20
 */
public class demo {
    public static void main(String[] args) {
        AbstractFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.creatPhone().message();
        huaweiFactory.creatPad().message();

        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.creatPhone().message();
        appleFactory.creatPad().message();
    }
}
