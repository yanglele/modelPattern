package com.template;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/7
 * version:
 * update:
 */

public abstract class DrinksBeverage {
    final void prepareMaterial(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondition()){
            addCondiments();
        }
    }

    abstract void brew();//冲泡
    abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling Water!");
    }

    protected void pourInCup(){
        System.out.println("Pour in cup!");
    }

    //hook方法，子类选择实现
    protected boolean customerWantsCondition(){
        return true;
    }
}
