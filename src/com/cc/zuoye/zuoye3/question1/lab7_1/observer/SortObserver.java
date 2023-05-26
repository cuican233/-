package com.cc.zuoye.zuoye3.question1.lab7_1.observer;


import com.cc.zuoye.zuoye3.question1.lab7_1.EditBox;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shubing
 */
public class SortObserver implements Observer {
    private final EditBox editBox;
    
    public SortObserver(EditBox editBox) {
        this.editBox = editBox;
    }
    
    @Override
    public void show() {
        String[] words = editBox.getText().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>(16);
        for (String word : words) {
            Integer count = wordCount.get(word);
            wordCount.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(wordCount);
    }
}
