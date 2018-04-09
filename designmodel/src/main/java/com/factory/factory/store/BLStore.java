package com.factory.factory.store;

import com.factory.factory.base.Pizza;
import com.factory.factory.base.PizzaStore;
import com.factory.factory.pizza.BLCheesePizza;
import com.factory.factory.pizza.BLClamPizza;

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
                return new BLCheesePizza();
            case CLAM:
                return new BLClamPizza();
            default:return null;
        }
    }
}
