package com.cc.design.factory.FactoryMethod;

/**
 * @author CC
 * @date 2023/5/20
 */
public class PadFactory implements HuaweiFactory {
    @Override
    public HuaweiProduct createHuawei() {
        return new HPad();
    }
}
