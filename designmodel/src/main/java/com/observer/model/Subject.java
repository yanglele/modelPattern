package com.observer.model;

/**
 * Desc:主题信息，信息源
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public interface Subject {

    void measurementDataChanged();//当天气状况变化时会调用此方法


    void registerObserver(Observer observer);//注册观察者

    void deleteObserver(Observer observer);//删除观察者

    void notifyObservers();//通知观察者

}
