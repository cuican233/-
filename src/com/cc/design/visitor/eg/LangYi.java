package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public class LangYi implements Car {

    /**
     * 价格
     */
    private String price;
    /**
     * 耗电量
     */
    private String powerConsumption;


    public LangYi(String price, String powerConsumption) {
        this.price = price;
        this.powerConsumption = powerConsumption;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

