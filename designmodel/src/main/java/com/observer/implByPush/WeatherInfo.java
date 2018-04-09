package com.observer.implByPush;

import com.observer.model.Observer;
import com.observer.model.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class WeatherInfo implements Subject {

    private List<Observer> observerList;

    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherInfo(){
       observerList = new ArrayList<>();
    }

    @Override
    public void measurementDataChanged() {
        notifyObservers();
    }

    //我们使用该方法模拟天气变化
    public void setWeatherData(int temperature,int pressure,int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementDataChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(temperature,pressure,humidity);
        }
    }
}
