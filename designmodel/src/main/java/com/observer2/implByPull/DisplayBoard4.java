package com.observer2.implByPull;

import com.observer2.model.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class DisplayBoard4 implements Observer,DisplayElement {

    private int temperature;
    private int pressure;


    public DisplayBoard4(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("total = "+(temperature + pressure));
    }

    //也可以将更新的参数放到arg中，构造成推送的形式，那就和implByPush中的一样了
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
