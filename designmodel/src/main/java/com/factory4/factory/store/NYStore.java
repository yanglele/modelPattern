package com.factory4.factory.store;

import com.factory4.factory.base.Pizza;
import com.factory4.factory.base.PizzaStore;
import com.factory4.factory.pizza.NYCheesPizza;
import com.factory4.factory.pizza.NYClamPizza;

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
                return new NYCheesPizza();
            case CLAM:
                return new NYClamPizza();
            default:return null;
        }
    }
}
