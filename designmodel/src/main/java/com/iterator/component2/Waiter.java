package com.iterator.component2;

import java.util.Iterator;

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
    
    public void printIterator(){
        MenuIterator iterator = (MenuIterator) menus.createIterator();
        while(iterator.hasNext()){
            MenuComponent menu = iterator.next();
            if(menu instanceof MenuItem){
                menu.print();
            }
        }
    }


}
