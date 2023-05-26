package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public interface Visitor {
    /**
     * 给辉腾增加访问者功能
     * @param huiTeng
     */
    void visit(HuiTeng huiTeng);

    /**
     * 给朗逸增加访问者功能
     * @param langYi
     */
    void visit(LangYi langYi);
}

