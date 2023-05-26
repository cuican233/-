package com.cc.zuoye.zuoye3.question1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CC
 * @date 2023/5/22
 */
public class Observe {
    public static void main(String[] args) {
        TextTail userText = new userText();
        userText.TextOperate(new tongji1());
        userText.TextOperate(new tongji2());
        userText.TextOperate(new tongji3());

        //userText操作后 三个统计区响应统计信息
        userText.notifyTongji();

    }
}

interface TextTail{
    void TextOperate(Tongji tongji);
    void notifyTongji();
}

class userText implements TextTail{

    private List<Tongji> allTongji = new ArrayList<>();
    @Override
    public void TextOperate(Tongji tongji) {
        allTongji.add(tongji);
    }

    @Override
    public void notifyTongji() {
        allTongji.forEach(tongji -> tongji.Tongji());
    }
}
interface Tongji{
    void Tongji();
}
class tongji1 implements Tongji{

    @Override
    public void Tongji() {
        System.out.println("显示可编辑文本区中出现的单词总数量和字符总数量");
    }
}
class tongji2 implements Tongji{

    @Override
    public void Tongji() {
        System.out.println("显示可编辑文本区中出现的单词（去重后按照字典序排序）");
    }
}
class tongji3 implements Tongji{

    @Override
    public void Tongji() {
        System.out.println("按照出频次降序显示可编辑文本区中出现的单词以及每个单词出现的次数");
    }
}
