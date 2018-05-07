package com.order6.remoteControl.instance;

/**
 * Desc:音响
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class Stereo {

    private int volume;

    public void turnOn(){
        System.out.println("stereo turn on");
    }

    public void putInCD(){
        System.out.println("stereo put cd");
    }

    public void setVolume(int volume){
        System.out.println("stereo setVolume"+volume);
    }

    public void turnOff(){
        System.out.println("stereo turn off");
    }
}
