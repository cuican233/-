package com.cc.zuoye.zuoye1.diyiti;

/**
 * @author CC
 * @date 2023/5/21
 */
public class WindowsFactory implements AbstractFactory {
    @Override
    public OperationController creatOperationController() {
        return new OperationController();
    }

    @Override
    public InterfaceController creatInterfaceController() {
        return new InterfaceController();
    }
}
