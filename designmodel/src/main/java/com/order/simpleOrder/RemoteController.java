package com.order.simpleOrder;

/**
 * Desc:遥控装置类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class RemoteController {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void onButtonPressed(){
        command.execute();
    }
}
