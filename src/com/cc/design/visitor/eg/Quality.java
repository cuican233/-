package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public class Quality implements Visitor{
    @Override
    public void visit(HuiTeng huiTeng) {
        System.out.println("质检人员只关注辉腾的油耗量，油耗量为："+huiTeng.getOilConsumption());
    }

    @Override
    public void visit(LangYi langYi) {
        System.out.println("质检人员只关注朗逸的电耗量，电耗量为："+langYi.getPowerConsumption());
    }
}

