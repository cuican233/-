package com.cc.design.visitor.eg;

/**
 * @author CC
 * @date 2023/5/24
 */
public class HuiTeng implements Car{

    /**
     * 价格
     */
    private String price;
    /**
     * 油耗量
     */
    private String oilConsumption;

    public HuiTeng(String price, String oilConsumption) {
        this.price = price;
        this.oilConsumption = oilConsumption;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOilConsumption() {
        return oilConsumption;
    }

    public void setOilConsumption(String oilConsumption) {
        this.oilConsumption = oilConsumption;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
