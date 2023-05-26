package com.cc.zuoye.zuoye3.question1.lab7_1;


import com.cc.zuoye.zuoye3.question1.lab7_1.observer.CountObserver;
import com.cc.zuoye.zuoye3.question1.lab7_1.observer.SortObserver;
import com.cc.zuoye.zuoye3.question1.lab7_1.observer.WordObserver;

public class Main {
    public static void main(String[] args) {
        EditBox editBox = new EditBox();
        editBox.addObserver(new CountObserver(editBox));
        editBox.addObserver(new WordObserver(editBox));
        editBox.addObserver(new SortObserver(editBox));
        editBox.edit("Hello, my name is LiHua");
    }
}
