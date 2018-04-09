package com.observer.implByPull;

import java.util.Observable;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class WeatherData extends Observable {

    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    //我们使用该方法模拟天气变化
    public void setWeatherData(int temperature,int pressure,int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

}
