package com.iterator.component;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/10
 * version:
 * update:
 */

public class Waiter {

    private MenuComponent menus;

    public Waiter(MenuComponent component){
        this.menus = component;
    }

    public void print(){
        menus.print();
    }


}
