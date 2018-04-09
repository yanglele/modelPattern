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

public class Espresso extends Beverage {

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL){
            return 1.0;
        }else if(size == Size.GRANDE){
            return 1.5;
        }else if(size == Size.VENTI){
            return 2.0;
        }
        return 1.0;
    }
}
