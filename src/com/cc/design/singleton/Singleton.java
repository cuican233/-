package com.cc.design.singleton;

/**
 * @author CC
 * @date 2023/5/20
 */

public class Singleton {
    //饿汉式  太饿了，直接实例化instance
    private static Singleton singleton =new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return singleton;
    }
}

class Instance{
    //懒汉式 在声明的时候不赋值  比较懒
    private volatile static Instance instance;
    private Instance(){
    }
    public static Instance getInstance(){
        //单线程下没问题，多线程——>双重检查锁
        if(instance==null){
            synchronized (Instance.class){
                if(instance==null){
                    instance=new Instance();
                    //不是原子化操作：可能发生指令重排序
                    // 1.singleton分配内存空间;
                    // 2.初始化singleton;
                    // 3.将singleton指向分配的内存空间。
                }
            }
        }
        return instance;
    }
}

class demo{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);

        System.out.println("-----------------");

        Instance i1 = Instance.getInstance();
        Instance i2 = Instance.getInstance();
        System.out.println(i1==i2);
    }
}
