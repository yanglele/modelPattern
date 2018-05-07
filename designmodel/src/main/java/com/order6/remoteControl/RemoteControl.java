package com.order6.remoteControl;

import com.order6.remoteControl.command.Command;
import com.order6.remoteControl.command.NoCommand;

/**
 * Desc:遥控装置，模拟遥控器的五个按键，每个装置有开与关两个按键
 * 通过按键里面存储相应的开关命令来操作相应的装置
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        //实例化空命令，这样使用时就不用判空了
        Command noCommand = new NoCommand();
        for(int i=0;i<onCommands.length;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int pos, Command onCommand, Command offCommand){
        onCommands[pos] = onCommand;
        offCommands[pos] = offCommand;
    }

    public void onButtonClick(int pos){
        onCommands[pos].execute();
    }

    public void offButtonClick(int pos){
        offCommands[pos].execute();
    }

}
