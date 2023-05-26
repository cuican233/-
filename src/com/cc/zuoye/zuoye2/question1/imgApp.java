package com.cc.zuoye.zuoye2.question1;

/**
 * @author CC
 * @date 2023/5/22
 */

/*
* 1、某手机美图APP软件支持多种不同的图像格式，例如JPG、GIF、BMP等常用图像格式，
* 同时提供了多种不同的滤镜对图像进行处理。
例如木刻滤镜（Cutout)，模糊滤镜(Blur)．锐化能镜（Sharpen)、纹理滤镜（Texlure）等。
现采用桥接模式设计该APP软件，使得该软件能够为多种图像格式提供一系列图像处理滤镜，
同时还能够很方便地增加新的图像格式和滤镜，绘制对应的类图并編程模拟实现。
*
*
* */

public abstract class imgApp {

    private Lvjing lvjing;

    public imgApp(Lvjing lvjing) {
        this.lvjing = lvjing;
    }
    public abstract void setFormat();
}

class JPG extends imgApp{

    public JPG(Lvjing lvjing) {
        super(lvjing);
        lvjing.show();
    }

    @Override
    public void setFormat() {
        System.out.println("JPG格式");
    }
}
class GIF extends imgApp{

    public GIF(Lvjing lvjing) {
        super(lvjing);
        lvjing.show();
    }

    @Override
    public void setFormat() {
        System.out.println("GIF格式");
    }
}
class BMP extends imgApp{

    public BMP(Lvjing lvjing) {
        super(lvjing);
        lvjing.show();
    }

    @Override
    public void setFormat() {
        System.out.println("BMP格式");
    }
}

interface Lvjing{
    void show();
}

class Cutout implements Lvjing{

    @Override
    public void show() {
        System.out.println("我是木刻滤镜");
    }
}
class Blur implements Lvjing{

    @Override
    public void show() {
        System.out.println("我是模糊滤镜");
    }
}
class Sharpen implements Lvjing{

    @Override
    public void show() {
        System.out.println("我是锐化滤镜");
    }
}
class Texlure implements Lvjing{

    @Override
    public void show() {
        System.out.println("我是纹理滤镜");
    }
}
class demo{
    public static void main(String[] args) {
        JPG jpgCutout = new JPG(new Cutout());
        jpgCutout.setFormat();

        BMP bmpBlur = new BMP(new Blur());
        bmpBlur.setFormat();
    }
}
