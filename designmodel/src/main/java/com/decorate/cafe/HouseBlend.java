package com.decorate.cafe;

import com.decorate.baseCafe.Beverage;

/**
 * Desc:具体的咖啡
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class HouseBlend extends Beverage {

    @Override
    public String getDesc() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL){
            return 6.0;
        }else if(size == Size.GRANDE){
            return 6.5;
        }else if(size == Size.VENTI){
            return 7.0;
        }
        return 6.0;
    }
}
