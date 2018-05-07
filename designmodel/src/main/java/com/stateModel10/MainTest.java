package com.stateModel10;

/**
 * Desc:状态模式：将状态封装到独立的类中，并实现该状态下的相关操作，然后将状态封装到目标对象内。
 * 目标对象的行为会随着状态的变化来改变行为。
 * 状态模式将状态封装为独立的类，并将动作委托到当前状态的对象。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class MainTest {
    public static void main(String[] args){
        GumballMachine machine = new GumballMachine(3);
        machine.enjectQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
    }
}
