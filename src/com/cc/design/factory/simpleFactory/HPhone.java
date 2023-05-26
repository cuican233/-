package com.cc.design.factory.simpleFactory;

import com.cc.design.factory.Phone.Phone;

/**
 * @author CC
 * @date 2023/5/20
 */
public class HPhone extends Huawei {
    @Override
    public void message() {
        System.out.println("我是华为手机");
    }
}
