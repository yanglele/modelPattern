package com.strategy.model;

/**
 * Desc:没有翅膀不能飞的鸭子
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly,i didn't have wing!");
    }
}
