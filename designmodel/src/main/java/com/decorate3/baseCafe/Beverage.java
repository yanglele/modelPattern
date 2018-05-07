package com.decorate3.baseCafe;

/**
 * Desc:基类的饮料类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public abstract class Beverage {

    public enum Size {TALL,GRANDE,VENTI}

    private String desc = "Unknown";//描述
    private Size size = Size.TALL;//默认小杯

    public String getDesc(){
        return desc;
    }

    public Size getSize(){
        return size;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public abstract double cost();
}
