package com.cc.design.factory.simpleFactory;
/**
 * @author CC
 * @date 2023/5/20
 */

public class SimpleHuaweiFactor {
    public Huawei creatPhone(String type){
        if(type.equals("phone")){
            return new HPhone();
        }
        else if(type.equals("pad")){
            return new HPad();
        }
        else {
            return null;
        }
    }
}
