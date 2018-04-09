package com.order.remoteControl.command;

import com.order.remoteControl.instance.Stereo;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOn();
        stereo.putInCD();
        stereo.setVolume(10);
    }
}
