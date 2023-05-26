package com.cc.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CC
 * @date 2023/5/22
 */
public class Observer {
    public static void main(String[] args) {
        //张三借钱
        debit zhangsan = new ZhangSan();
        zhangsan.borrow(new WangWu());
        zhangsan.borrow(new LiSi());

        //张三有钱了
        zhangsan.notifyCredits();
    }
}

interface debit{
    void borrow(Credit credit);
    void notifyCredits();
}

class ZhangSan implements debit{
    private List<Credit> allCredit = new ArrayList<>();
    @Override
    public void borrow(Credit credit) {
        allCredit.add(credit);
    }
    @Override
    public void notifyCredits() {
        allCredit.forEach(credit -> credit.takeMoney());
    }
}

interface Credit{
    void takeMoney();
}

class WangWu implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("王五要钱！");
    }
}
class LiSi implements Credit{

    @Override
    public void takeMoney() {
        System.out.println("李四要钱！");
    }
}