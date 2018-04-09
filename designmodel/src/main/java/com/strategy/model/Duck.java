package com.strategy.model;

/**
 * Desc:鸭子的公共属性，游戏，外观
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public abstract class Duck {

    protected FlyBehavior flyBehavior;//飞翔属性
    protected QuackBehavior quackBehavior;//叫声属性

    protected abstract void swim();//游泳
    protected abstract void display();//外表

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
