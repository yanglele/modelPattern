package com.factory.factory.pizza;

import com.factory.factory.base.Pizza;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class NYClamPizza extends Pizza {

    public NYClamPizza(){
        this.name = "纽约海鲜披萨";
        this.flour = "高精面粉";
        this.sauce = "海鲜酱";
    }

    @Override
    public void prepare() {
        System.out.println("I need be prepared careful!");
    }


}
