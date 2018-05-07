package com.factory4.abstractFactory.store;

import com.factory4.abstractFactory.base.Pizza;
import com.factory4.abstractFactory.base.PizzaStore;
import com.factory4.abstractFactory.pizza.NYCheesePizza;
import com.factory4.abstractFactory.pizza.NYClamPizza;
import com.factory4.abstractFactory.source.factory.NYPizzaIngredientFactory;

/**
 * Desc:纽约披萨店
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class NYStore extends PizzaStore {

    @Override
    public Pizza createPizza(Pizza.TYPE type) {
        switch (type){
            case CHEESE:
                return new NYCheesePizza(new NYPizzaIngredientFactory());
            case CLAM:
                return new NYClamPizza(new NYPizzaIngredientFactory());
            default:return null;
        }
    }
}
