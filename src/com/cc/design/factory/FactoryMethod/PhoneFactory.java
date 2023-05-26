package com.cc.design.factory.FactoryMethod;

/**
 * @author CC
 * @date 2023/5/20
 */
public class PhoneFactory implements HuaweiFactory {
    @Override
    public HuaweiProduct createHuawei() {
        return new HPhone();
    }
}
