package com.strategy1.model;

/**
 * Desc:吱吱叫
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("My voice just like:squeak");
    }
}
