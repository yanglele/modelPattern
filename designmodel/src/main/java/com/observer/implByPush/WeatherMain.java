package com.observer.implByPush;

/**
 * Desc:观察者模式 当被观察者有信息更新时主动推送给观察者
 * idea：观察者模式定义了一对多的关系，当被观察者状态改变时会通知其所有订阅者更新信息
 * idea：强大的松耦合关系
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class WeatherMain {
    public static void main(String[] args){
        WeatherInfo weatherInfo = new WeatherInfo();
        new DisplayBoard(weatherInfo);
        new DisplayBoard2(weatherInfo);
        weatherInfo.setWeatherData(10,12,13);
    }
}
