package com.factory4.factory.base;

/**
 * Desc:披萨店铺基类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public abstract class PizzaStore {

   public Pizza orderPizza(Pizza.TYPE type){
       Pizza pizza = createPizza(type);
       pizza.prepare();
       pizza.cook();
       pizza.cut();
       pizza.box();
       return pizza;
   }

   public abstract Pizza createPizza(Pizza.TYPE type);
}
