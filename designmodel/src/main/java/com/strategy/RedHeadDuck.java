package com.strategy;

import com.strategy.model.Duck;
import com.strategy.model.FlyWithWings;
import com.strategy.model.Quack;

/**
 * Desc:红头鸭，能飞，呱呱叫
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    protected void swim() {
        System.out.println("RedHeadDuck:I can swim!");
    }

    @Override
    protected void display() {
        System.out.println("RedHeadDuck:My head is red color!");
    }
}
