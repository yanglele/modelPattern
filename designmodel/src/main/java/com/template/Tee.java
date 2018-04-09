package com.template;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/7
 * version:
 * update:
 */

public class Tee extends DrinksBeverage {

    @Override
    void brew() {
        System.out.println("Tee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tee brew");
    }

    protected boolean customerWantsCondition(){
        return false;
    }

}
