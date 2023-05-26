package com.cc.zuoye.zuoye3.question1.lab7_1.observer;

import com.cc.zuoye.zuoye3.question1.lab7_1.EditBox;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordObserver implements Observer {
    private final EditBox editBox;

    public WordObserver(EditBox editBox) {
        this.editBox = editBox;
    }

    @Override
    public void show() {
        String text = editBox.getText();
        List<String> words = Arrays.stream(text.split("\\s+")).distinct().sorted().collect(Collectors.toList());
        System.out.println("单词：" + words);
    }
}