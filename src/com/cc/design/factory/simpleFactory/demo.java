package com.cc.design.factory.simpleFactory;

/**
 * @author CC
 * @date 2023/5/20
 */
public class demo {
    public static void main(String[] args) {
        SimpleHuaweiFactor simplePhoneFactor = new SimpleHuaweiFactor();
        simplePhoneFactor.creatPhone("phone").message();

        simplePhoneFactor.creatPhone("pad").message();
    }
}
