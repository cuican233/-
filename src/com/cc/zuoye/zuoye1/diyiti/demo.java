package com.cc.zuoye.zuoye1.diyiti;

/**
 * @author CC
 * @date 2023/5/21
 */
public class demo {
    public static void main(String[] args) {
        AbstractFactory iosFactory = new iosFactory();
        iosFactory.creatInterfaceController().message();

    }
}
