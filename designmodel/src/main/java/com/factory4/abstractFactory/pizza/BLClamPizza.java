package com.factory4.abstractFactory.pizza;

import com.factory4.abstractFactory.base.Pizza;
import com.factory4.abstractFactory.source.factory.PizzaIngredientFactory;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class BLClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public BLClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = "巴黎海鲜披萨";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("正在准备 巴黎海鲜披萨");
    }


}
