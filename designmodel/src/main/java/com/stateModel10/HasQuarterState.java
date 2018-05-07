package com.stateModel10;

import java.util.Random;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/15
 * version:
 * update:
 */

public class HasQuarterState implements State {

    private GumballMachine machine;

    private Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned!");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned.....Waiting...");
        int winner = random.nextInt(10);
        if(winner == 0 && machine.getCount() > 1){
            machine.setState(machine.getWinnerState());
        }else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("HasQuarterState bad dispense operator!");
    }
}
