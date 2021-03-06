package com.factory4.abstractFactory.source.factory;

import com.factory4.abstractFactory.source.material.Cheese;
import com.factory4.abstractFactory.source.material.Dough;
import com.factory4.abstractFactory.source.material.MarinaraSauce;
import com.factory4.abstractFactory.source.material.ReggianoCheese;
import com.factory4.abstractFactory.source.material.Sauce;
import com.factory4.abstractFactory.source.material.ThinCrustDough;

/**
 * Desc:巴黎原料工厂
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class BLPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
