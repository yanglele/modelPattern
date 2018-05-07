package com.order6.remoteControl.instance;

/**
 * Desc:吊扇
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/5
 * version:
 * update:
 */

public class CeilingFan {
    public static final int HIGH = 1;
    public static final int MEDIUM = 2;
    public static final int LOW =3;
    public static final int OFF =0;

    private int speed;//吊扇速度

    public CeilingFan(){
    }

    public void setHigh(){
        speed = HIGH;
        System.out.println("ceiling setHigh");
    }

    public void setLow(){
        speed = LOW;
        System.out.println("ceiling setLow");
    }

    public void setMedium(){
        speed = MEDIUM;
        System.out.println("ceiling setMedium");
    }

    public void turnOff(){
        speed = OFF;
        System.out.println("ceiling turn off");
    }

    public int getSpeed(){
        return speed;
    }
}
