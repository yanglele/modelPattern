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

public class NYCheesPizza extends Pizza {

    public NYCheesPizza(){
        this.name = "纽约芝士披萨";
        this.flour = "高精面粉";
        this.sauce = "千岛酱";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices!");
    }
}