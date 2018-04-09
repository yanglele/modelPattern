package com.order.remoteControl.instance;

/**
 * Desc:电灯实体类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class Light {

    private String lightRoom;

    public Light(String lightRoom){
        this.lightRoom = lightRoom;
    }

    public void turnOn(){
        System.out.println(lightRoom + "light turn on");
    }

    public void turnOff(){
        System.out.println(lightRoom + "light turn off");
    }
}
