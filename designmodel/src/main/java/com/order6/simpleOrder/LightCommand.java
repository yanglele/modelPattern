package com.order6.simpleOrder;

/**
 * Desc:命令实体类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
