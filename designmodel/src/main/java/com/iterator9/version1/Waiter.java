package com.iterator9.version1;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class Waiter {

    private DinnerMenu dinnerMenu;
    private LunchMenu lunchMenu;

    public Waiter(DinnerMenu dinnerMenu,LunchMenu lunchMenu){
        this.dinnerMenu = dinnerMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu(){
        LunchIterator lunchIterator = (LunchIterator) lunchMenu.createIterator();
        DinnerIterator dinnerIterator = (DinnerIterator) dinnerMenu.createIterator();
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
