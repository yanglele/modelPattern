package com.strategy1;

import com.strategy1.model.Duck;
import com.strategy1.model.FlyWithWings;
import com.strategy1.model.MuteQuack;

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
