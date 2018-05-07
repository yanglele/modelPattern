package com.observer2.implByPush;

import com.observer2.model.DisplayElement;
import com.observer2.model.Observer;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class DisplayBoard implements Observer,DisplayElement {

    private int temperature;
    private int pressure;
    private int humidity;

    public DisplayBoard(WeatherInfo weatherInfo){
        weatherInfo.registerObserver(this);
    }


    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature:"+temperature+";"+"pressure:"+pressure+";"+"humidity:"+humidity);
    }
}
