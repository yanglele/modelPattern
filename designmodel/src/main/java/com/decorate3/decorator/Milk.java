package com.decorate3.decorator;

import com.decorate3.baseCafe.Beverage;
import com.decorate3.baseDecorator.CondimentDecorator;

/**
 * Desc:装饰者 ：配料+奶
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Milk";
    }

    @Override
    public double cost() {
        double milkCost = 0;
        switch (getSize()){
            case TALL:milkCost = 0.1;break;
            case GRANDE:milkCost = 0.2;break;
            case VENTI:milkCost = 0.3;break;
            default:break;
        }
        return beverage.cost() + milkCost;
    }
}
