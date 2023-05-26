package com.cc.design.factory.simpleFactory;

import com.cc.design.factory.Pad.Pad;

/**
 * @author CC
 * @date 2023/5/20
 */
public class HPad extends Huawei {
    @Override
    public void message() {
        System.out.println("我是华为Pad");
    }
}
