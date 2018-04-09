package com.adapter;

/**
 * Desc:适配器模式，讲一个类的接口，转换成客户期待的另一个接口。
 * 适配器让原本接口不兼容的类可以合作无间。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class MainTest {
    public static void main(String[] args){

        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);
        duck.quack();
        duck.fly();
    }
}
