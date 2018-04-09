package com.strategy;

import com.strategy.model.Duck;
import com.strategy.model.FlyNoWay;
import com.strategy.model.MuteQuack;

/**
 * Desc:鸭嘴兽 会叫 不会飞
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class PlatypusDuck extends Duck {

    public PlatypusDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void swim() {
        System.out.println("PlatypusDuck:I can swim!");
    }

    @Override
    protected void display() {
        System.out.println("PlatypusDuck:I am PlatypusDuck!");
    }
}
