package com.stateModel10;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class SoldOutState implements State {

    private GumballMachine machine;

    public SoldOutState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry,no more gumball!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,You did not pay!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry,You did not pay!");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry,You did not pay!");
    }
}
