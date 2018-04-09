package com.factory.abstractFactory.source.factory;

import com.factory.abstractFactory.source.material.Cheese;
import com.factory.abstractFactory.source.material.Dough;
import com.factory.abstractFactory.source.material.Sauce;

/**
 * Desc:加入原料管理的工厂类  抽象工厂模式
 * 插入到 pizza的prepare阶段
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
