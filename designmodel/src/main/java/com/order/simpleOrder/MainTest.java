package com.order.simpleOrder;

/**
 * Desc:简单的命令模式，该模式通过命令将灯泡实体类与控制器分开，已完成解耦
 * 命令中需要封装具体的实体类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class MainTest {

    public static void main(String[] args){
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        RemoteController controller = new RemoteController();
        controller.setCommand(lightCommand);
        controller.onButtonPressed();
    }
}
