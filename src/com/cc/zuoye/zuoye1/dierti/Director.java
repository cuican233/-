package com.cc.zuoye.zuoye1.dierti;

/**
 * @author CC
 * @date 2023/5/21
 */

/*
* 在某赛车游戏中，赛车包括方程式赛车、场地越野赛车、运动汽车、卡车等类型，
* 不同类型的赛车的车身、发动机、轮胎、变速箱等部件有所区别，玩家可以自行选择赛车类型，
* 系统将根据玩家的选择创建出一辆完整的赛车。现采用建造者模式实现赛车的构建，绘制对应的类图并编程模拟实现。
* */
public class Director {

    public void Builder(Builder builder){
        builder.buildBody();
        builder.buildengine();
        builder.buildtires();
        builder.buildgearbox();
    }
}

interface Builder{
    void buildBody();
    void buildengine();
    void buildtires();
    void buildgearbox();
    Car getCar();
}

class f1Car implements Builder{

    private Car f1car = new Car();

    @Override
    public void buildBody() {
        f1car.setBody("f1车身");
    }

    @Override
    public void buildengine() {
        f1car.setEngine("f1引擎");
    }

    @Override
    public void buildtires() {
        f1car.setTires("f1轮胎");
    }

    @Override
    public void buildgearbox() {
        f1car.setGearbox("f1变速箱");
    }

    @Override
    public Car getCar() {
        return f1car;
    }
}

class yueyeCar implements Builder{

    private Car yueyeCar = new Car();

    @Override
    public void buildBody() {
        yueyeCar.setBody("yueyeCar车身");
    }

    @Override
    public void buildengine() {
        yueyeCar.setEngine("yueyeCar引擎");
    }

    @Override
    public void buildtires() {
        yueyeCar.setTires("yueyeCar轮胎");
    }

    @Override
    public void buildgearbox() {
        yueyeCar.setGearbox("yueyeCar变速箱");
    }

    @Override
    public Car getCar() {
        return yueyeCar;
    }
}

class bigCar implements Builder{

    private Car bigCar = new Car();

    @Override
    public void buildBody() {
        bigCar.setBody("bigCar车身");
    }

    @Override
    public void buildengine() {
        bigCar.setEngine("bigCar引擎");
    }

    @Override
    public void buildtires() {
        bigCar.setTires("bigCar轮胎");
    }

    @Override
    public void buildgearbox() {
        bigCar.setGearbox("bigCar变速箱");
    }

    @Override
    public Car getCar() {
        return bigCar;
    }
}

class sportCar implements Builder{

    private Car sportCar = new Car();

    @Override
    public void buildBody() {
        sportCar.setBody("sportCar车身");
    }

    @Override
    public void buildengine() {
        sportCar.setEngine("sportCar引擎");
    }

    @Override
    public void buildtires() {
        sportCar.setTires("sportCar轮胎");
    }

    @Override
    public void buildgearbox() {
        sportCar.setGearbox("sportCar变速箱");
    }

    @Override
    public Car getCar() {
        return sportCar;
    }
}

class Car{
    private String Body;

    private String engine;

    private String tires;

    private String gearbox;

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void show(){
        System.out.println("我的组成部件：车身:"+Body+"，引擎:"+engine+",轮胎:"+tires+"，变速箱:"+gearbox);
    }
}


class demo{
    public static void main(String[] args) {
        Director director = new Director();
        f1Car f1Car = new f1Car();
        yueyeCar yueyeCar = new yueyeCar();
        bigCar bigCar = new bigCar();
        sportCar sportCar = new sportCar();
        director.Builder(f1Car);
        f1Car.getCar().show();
        director.Builder(sportCar);
        sportCar.getCar().show();


    }
}



