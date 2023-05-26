package com.cc.zuoye.zuoye3.question1.lab7_1.observer;

import com.cc.zuoye.zuoye3.question1.lab7_1.EditBox;

public class CountObserver implements Observer {
    private final EditBox editBox;

    public CountObserver(EditBox editBox) {
        this.editBox = editBox;
    }

    @Override
    public void show() {
        String text = editBox.getText();
        int wordCount = text.split("\\s+").length;
        System.out.println("单词数：" + wordCount);
        int charCount = text.codePointCount(0, text.length());
        System.out.println("字符数：" + charCount);
    }
}
