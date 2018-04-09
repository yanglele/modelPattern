package com.observer.implByPull;

/**
 * Desc:当有数据变化时被订阅者通知订阅者，然后订阅者主动拉取消息
 * 使用java sdk的基类，实现思想和我们自己的一样，但加入了并发操作保护
 * @see java.util.Observable 是个类 不利于扩展
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class WeatherMain {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        //sdk中实现的是倒序通知，即最后加入的最先通知
        new DisplayBoard3(weatherData);
        new DisplayBoard4(weatherData);
        weatherData.setWeatherData(10,11,12);
    }
}
