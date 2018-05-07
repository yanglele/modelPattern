package com.factory4.abstractFactory.source.factory;

import com.factory4.abstractFactory.source.material.Cheese;
import com.factory4.abstractFactory.source.material.Dough;
import com.factory4.abstractFactory.source.material.Sauce;

/**
 * Desc:加入原料管理的工厂类  抽象工厂模式
 * 插入到 pizza的prepare阶段
 * 抽象工程模式：提供一个接口，用于创建相关或者以来对象的家族，而不需要明确指定具体类。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public interface PizzaIngredientFactory {

     Cheese createCheese();
     Dough createDough();
     Sauce createSauce();

}
