package com.order6.remoteControl;

import com.order6.remoteControl.command.CeilingFanHighCommand;
import com.order6.remoteControl.command.CeilingFanLowCommand;
import com.order6.remoteControl.command.CeilingFanOffCommand;
import com.order6.remoteControl.command.LightOffCommand;
import com.order6.remoteControl.command.LightOnCommand;
import com.order6.remoteControl.command.StereoOffCommand;
import com.order6.remoteControl.command.StereoOnCommand;
import com.order6.remoteControl.instance.CeilingFan;
import com.order6.remoteControl.instance.Light;
import com.order6.remoteControl.instance.Stereo;

/**
 * Desc:命令模式：将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class MainTest {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingLight = new Light("living room light");
        LightOffCommand livingOffLightCommand = new LightOffCommand(livingLight);
        LightOnCommand livingOnLightCommand = new LightOnCommand(livingLight);
        remoteControl.setCommand(0,livingOnLightCommand,livingOffLightCommand);


        Light kitchenLight = new Light("kitchen room light");
        LightOffCommand kitchenOffLightCommand = new LightOffCommand(kitchenLight);
        LightOnCommand kitchenOnLightCommand = new LightOnCommand(kitchenLight);
        remoteControl.setCommand(1,kitchenOnLightCommand,kitchenOffLightCommand);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(2,stereoOnCommand,stereoOffCommand);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(3,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommand(4,ceilingFanLowCommand,ceilingFanOffCommand);

        remoteControl.onButtonClick(0);
        remoteControl.offButtonClick(0);
        remoteControl.onButtonClick(1);
        remoteControl.offButtonClick(1);
        remoteControl.onButtonClick(2);
        remoteControl.offButtonClick(2);
        remoteControl.onButtonClick(3);
        remoteControl.offButtonClick(3);
        remoteControl.onButtonClick(4);
        remoteControl.offButtonClick(4);

    }
}
