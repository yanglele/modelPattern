package com.stateModel10;

/**
 * Desc:添加中奖状态，10%几率中奖，获得两块糖
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class WinnerState implements State {

    private GumballMachine machine;

    public WinnerState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("bad operator!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("bad operator!");
    }

    @Override
    public void turnCrank() {
        System.out.println("bad operator!");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner!You can get two gumballs !");
        machine.releaseBall();
        if(machine.getCount() == 0){
            machine.setState(machine.getSoldOutState());
        }else {
            machine.releaseBall();
            if(machine.getCount() == 0){
                machine.setState(machine.getSoldOutState());
            }else {
                machine.setState(machine.getNoQuarterState());
            }
        }
    }
}
