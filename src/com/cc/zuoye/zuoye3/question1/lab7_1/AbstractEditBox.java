package com.cc.zuoye.zuoye3.question1.lab7_1;

import com.cc.zuoye.zuoye3.question1.lab7_1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEditBox {
    protected String text = "";
    protected List<Observer> observers = new ArrayList<>();

    public String getText() {
        return text.trim();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void edit(String text);
}

