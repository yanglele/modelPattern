package com.stateModel10;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You did not has inserted quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You did not has inserted quarter!");
    }

    @Override
    public void dispense() {
        System.out.println("You should pay first!");
    }
}
