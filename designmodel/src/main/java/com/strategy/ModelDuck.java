package com.strategy;

import com.strategy.model.Duck;
import com.strategy.model.FlyNoWay;
import com.strategy.model.FlyWithWings;
import com.strategy.model.MuteQuack;
import com.strategy.model.Quack;

/**
 * Desc:模型鸭，会飞不会叫
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void swim() {
        System.out.println("ModelDuck:I can swim!");
    }

    @Override
    protected void display() {
        System.out.println("ModelDuck:I am a model!");
    }
}
