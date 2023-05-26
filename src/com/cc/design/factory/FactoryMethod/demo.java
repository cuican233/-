package com.cc.design.factory.FactoryMethod;

import com.cc.design.factory.Phone.Phone;

/**
 * @author CC
 * @date 2023/5/20
 */
public class demo {
    public static void main(String[] args) {
        HuaweiFactory huaweiphoneFactory = new PhoneFactory();
        huaweiphoneFactory.createHuawei().message();

        HuaweiFactory huaweipadFactory = new PadFactory();
        huaweipadFactory.createHuawei().message();

    }
}
