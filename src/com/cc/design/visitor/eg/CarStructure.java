package com.cc.design.visitor.eg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CC
 * @date 2023/5/24
 */
public class CarStructure {

    /**
     * 要操作的汽车集合
     */
    private List<Car> list = new ArrayList<>();

    /**
     * 添加汽车
     *
     * @param car
     */
    public void addCar(Car car) {
        list.add(car);
    }

    public void handle(Visitor visitor) {
        //遍历，接受访问
        for (Car car : list) {
            car.accept(visitor);
        }
    }
}

