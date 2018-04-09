package com.factory.abstractFactory.store;

import com.factory.abstractFactory.base.Pizza;
import com.factory.abstractFactory.base.PizzaStore;
import com.factory.abstractFactory.pizza.BLCheesePizza;
import com.factory.abstractFactory.pizza.BLClamPizza;
import com.factory.abstractFactory.source.factory.BLPizzaIngredientFactory;

/**
 * Desc:巴黎披萨店
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class BLStore extends PizzaStore {
    @Override
    public Pizza createPizza(Pizza.TYPE type) {
        switch (type){
            case CHEESE:
                return new BLCheesePizza(new BLPizzaIngredientFactory());
            case CLAM:
                return new BLClamPizza(new BLPizzaIngredientFactory());
            default:return null;
        }
    }
}
