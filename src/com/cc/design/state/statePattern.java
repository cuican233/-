package com.cc.design.state;

/**
 * @author CC
 * @date 2023/5/22
 */
public class statePattern {
    public static void main(String[] args) {
        Context zhangsan = new Context();
        zhangsan.changeState(new Happy());
        zhangsan.doWork();
        zhangsan.changeState(new Sad());
        zhangsan.doWork();
    }
}

abstract class state{
    abstract void dowork();
}
class Happy extends state{

    @Override
    void dowork() {
        System.out.println("积极主动！");
    }
}
class Angry extends state{

    @Override
    void dowork() {
        System.out.println("萎靡不振！");
    }
}
class Sad extends state{

    @Override
    void dowork() {
        System.out.println("摆烂！");
    }
}

class Context{
    private state state;

    public void changeState(state state) {
        this.state = state;
    }
    public void doWork(){
        state.dowork();
    }
}
