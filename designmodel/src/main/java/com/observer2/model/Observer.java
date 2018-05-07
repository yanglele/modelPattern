package com.observer2.model;

/**
 * Desc:观察者
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public interface Observer {

    void update(int temperature,int pressure,int humidity);//更新信息
}
