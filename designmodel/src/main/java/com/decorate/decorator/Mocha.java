package com.decorate.decorator;

import com.decorate.baseCafe.Beverage;
import com.decorate.baseDecorator.CondimentDecorator;

/**
 * Desc:装饰者 ：配料+摩卡
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        double mochaCost = 0;
        switch (getSize()){
            case TALL:mochaCost = 0.2;break;
            case GRANDE:mochaCost = 0.3;break;
            case VENTI:mochaCost = 0.4;break;
            default:break;
        }
        return beverage.cost()+mochaCost;
    }
}
