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

public class NYCheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = "纽约芝士披萨";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("正在准备 纽约芝士披萨");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices!");
    }
}
