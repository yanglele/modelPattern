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

public class BLCheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public BLCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;

    }

    @Override
    public void prepare() {
        this.name = "巴黎芝士披萨";
        this.cheese = ingredientFactory.createCheese();
        this.sauce = ingredientFactory.createSauce();
        this.dough = ingredientFactory.createDough();
        System.out.println("正在准备 巴黎芝士披萨");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices!");
    }
}
