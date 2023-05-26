package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public class Sales implements Visitor{
    @Override
    public void visit(HuiTeng huiTeng) {
        System.out.println("销售人员只关注辉腾的价格，价格为："+huiTeng.getPrice());
    }

    @Override
    public void visit(LangYi langYi) {
        System.out.println("销售人员只关注朗逸的价格，价格为："+langYi.getPrice());
    }
}

