package com.cc.design.factory.AbstractFactory;

import com.cc.design.factory.Pad.HuaweiPad;
import com.cc.design.factory.Pad.Pad;
import com.cc.design.factory.Phone.HuaweiPhone;
import com.cc.design.factory.Phone.Phone;

/**
 * @author CC
 * @date 2023/5/20
 */
public class HuaweiFactory implements AbstractFactory {
    @Override
    public Phone creatPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad creatPad() {
        return new HuaweiPad();
    }
}
