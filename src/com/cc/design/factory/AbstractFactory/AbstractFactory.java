package com.cc.design.factory.AbstractFactory;

import com.cc.design.factory.Pad.Pad;
import com.cc.design.factory.Phone.Phone;

/**
 * @author CC
 * @date 2023/5/20
 */
public interface AbstractFactory {
    Phone creatPhone();
    Pad creatPad();
}
