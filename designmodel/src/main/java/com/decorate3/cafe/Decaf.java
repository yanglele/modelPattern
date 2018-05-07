package com.decorate3.cafe;

import com.decorate3.baseCafe.Beverage;

/**
 * Desc:具体的咖啡
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class Decaf extends Beverage {

    @Override
    public String getDesc() {
        return "Decaf";
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL){
            return 2.0;
        }else if(size == Size.GRANDE){
            return 2.5;
        }else if(size == Size.VENTI){
            return 3.0;
        }
        return 2.0;
    }
}
