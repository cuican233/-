package com.cc.zuoye.zuoye2.question2;

/**
 * @author CC
 * @date 2023/5/22
 */
public class facade {
    public void autoSave(){
        new tongxun().tongxunSave();
        new message().messageSave();
        new img().imgSave();
        new song().songSave();
        System.out.println("一键备份成功！");
    }
}
class tongxun{
    public void tongxunSave(){
        System.out.println("通讯录备份");
    }
}
class message{
    public void messageSave(){
        System.out.println("信息备份");
    }
}
class img{
    public void imgSave(){
        System.out.println("照片备份");
    }
}
class song{
    public void songSave(){
        System.out.println("歌曲备份");
    }
}
class demo{
    public static void main(String[] args) {
        facade facade = new facade();
        facade.autoSave();
    }
}

