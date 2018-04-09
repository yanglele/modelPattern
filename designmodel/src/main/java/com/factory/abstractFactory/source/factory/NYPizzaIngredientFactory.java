package com.factory.abstractFactory.source.factory;

import com.factory.abstractFactory.source.material.Cheese;
import com.factory.abstractFactory.source.material.Dough;
import com.factory.abstractFactory.source.material.MozzarellaCheese;
import com.factory.abstractFactory.source.material.PlumTomatoSauce;
import com.factory.abstractFactory.source.material.Sauce;
import com.factory.abstractFactory.source.material.ThickCrustDough;

/**
 * Desc:纽约原料工厂
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{


    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
