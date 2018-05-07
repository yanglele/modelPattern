package com.stateModel10;

/**
 * Desc:出售状态
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we are giving you a gumball!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,You have turned the crank!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry,You cannot turn crank twice!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if(machine.getCount() > 0){
            machine.setState(machine.getNoQuarterState());
        }else {
            System.out.println("Out of gumballs!");
            machine.setState(machine.getSoldOutState());
        }
    }
}
