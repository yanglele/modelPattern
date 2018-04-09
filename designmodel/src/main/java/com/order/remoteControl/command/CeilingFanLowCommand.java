package com.order.remoteControl.command;

import com.order.remoteControl.instance.CeilingFan;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class CeilingFanLowCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setLow();
    }
}
