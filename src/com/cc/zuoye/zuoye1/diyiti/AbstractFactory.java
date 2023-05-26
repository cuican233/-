package com.cc.zuoye.zuoye1.diyiti;

/**
 * @author CC
 * @date 2023/5/21
 */
/*某软件公司要推出一款新的手机游戏软件，该软件能够支持ios. Android和
Windows Phone等多个智能手机操作系统平台，针对不同的手机操作系统，该游戏软件提
供了不同的游戏操作控制(OperationController)类和游戏界面控制(InterfaceController)
类,并提供相应的工厂类来封装这些类的初始化过程。软件要求具有较好的扩展性以支持
新的操作系统平台,为了满足上述需求，试采用抽象工厂模式对其进行设计。*/
public interface AbstractFactory {
    OperationController creatOperationController();
    InterfaceController creatInterfaceController();
}
