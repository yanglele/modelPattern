package com.template8;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/7
 * version:
 * update:
 */

public class Coffee extends DrinksBeverage {

    @Override
    void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee addCondiments");
    }
}
