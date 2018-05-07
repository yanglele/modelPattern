package com.strategy1.model;

/**
 * Desc:不会叫
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I didn't have voice!");
    }
}
