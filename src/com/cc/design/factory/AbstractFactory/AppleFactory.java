package com.cc.design.factory.AbstractFactory;

import com.cc.design.factory.Pad.ApplePad;
import com.cc.design.factory.Pad.Pad;
import com.cc.design.factory.Phone.ApplePhone;
import com.cc.design.factory.Phone.Phone;

/**
 * @author CC
 * @date 2023/5/20
 */
public class AppleFactory implements AbstractFactory
{
    @Override
    public Phone creatPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad creatPad() {
        return new ApplePad();
    }
}
