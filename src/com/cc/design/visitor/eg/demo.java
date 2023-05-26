package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public class demo {

    public static void main(String[] args) {
        HuiTeng huiTeng = new HuiTeng("100w", "14.5L/100km");
        LangYi langYi = new LangYi("20w", "13.2kWh/100km");

        CarStructure carStructure = new CarStructure();
        carStructure.addCar(huiTeng);
        carStructure.addCar(langYi);

        //访问
        carStructure.handle(new Sales());
        carStructure.handle(new Quality());

    }
}

