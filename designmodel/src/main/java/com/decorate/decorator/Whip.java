package com.decorate.decorator;

import com.decorate.baseCafe.Beverage;
import com.decorate.baseDecorator.CondimentDecorator;

/**
 * Desc:装饰者：配料+奶昔
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class Whip  extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+", Whip";
    }

    @Override
    public double cost() {
        double whipCost = 0;
        switch (getSize()){
            case TALL:whipCost = 0.12;break;
            case GRANDE:whipCost = 0.22;break;
            case VENTI:whipCost = 0.32;break;
            default:break;
        }
        return beverage.cost() + whipCost;
    }
}
