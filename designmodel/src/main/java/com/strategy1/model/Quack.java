package com.strategy1.model;

/**
 * Desc:呱呱叫
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("My voice just like:quack");
    }
}
