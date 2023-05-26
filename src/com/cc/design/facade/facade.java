package com.cc.design.facade;

/**
 * @author CC
 * @date 2023/5/22
 */
public class facade {
    public void autoCooking(){
        new FirstProcessor().boliWater();
        new SecondProcessor().washing();
        new ThirdProcessor().cutting();
        new ForthProcessor().cooking();
        System.out.println("做好饭了！");
    }
}

class FirstProcessor{
    public void boliWater(){
        System.out.println("第一步：烧水");
    }
}
class SecondProcessor{
    public void washing(){
        System.out.println("第二步：洗菜");
    }
}
class ThirdProcessor{
    public void cutting(){
        System.out.println("第三步：切菜");
    }
}
class ForthProcessor{
    public void cooking(){
        System.out.println("第四步：烹饪");
    }
}
class demo{
    public static void main(String[] args) {
        facade facade = new facade();
        facade.autoCooking();
    }
}