package com.factory.abstractFactory.store;

import com.factory.abstractFactory.base.Pizza;
import com.factory.abstractFactory.base.PizzaStore;
import com.factory.abstractFactory.pizza.NYCheesePizza;
import com.factory.abstractFactory.pizza.NYClamPizza;
import com.factory.abstractFactory.source.factory.NYPizzaIngredientFactory;

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
