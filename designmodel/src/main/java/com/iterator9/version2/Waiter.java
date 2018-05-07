package com.iterator9.version2;

import com.iterator9.version1.MenuItem;

import java.util.Iterator;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class Waiter {

    private Menu dinnerMenu;
    private Menu lunchMenu;

    public Waiter(Menu dinnerMenu, Menu lunchMenu){
        this.dinnerMenu = dinnerMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu(){
        Iterator lunchIterator = lunchMenu.createIterator();
        Iterator dinnerIterator =  dinnerMenu.createIterator();
        printMenu(lunchIterator);
        printMenu(dinnerIterator);

    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "  "+menuItem.getDesc() +"  "+menuItem.getPrice());
        }
    }

}
