package com.factory.abstractFactory.pizza;

import com.factory.abstractFactory.base.Pizza;
import com.factory.abstractFactory.source.factory.PizzaIngredientFactory;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class NYClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public NYClamPizza(PizzaIngredientFactory ingredientFactory){
       this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = "纽约海鲜披萨";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("正在准备 纽约海鲜披萨");
    }


}
