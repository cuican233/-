package com.cc.zuoye.zuoye3.question1.lab7_1;


import com.cc.zuoye.zuoye3.question1.lab7_1.observer.Observer;

public class EditBox extends AbstractEditBox {
    @Override
    public void edit(String text) {
        System.out.println("edit: " + text);
        this.text = text;
        observers.forEach(Observer::show);
    }
}