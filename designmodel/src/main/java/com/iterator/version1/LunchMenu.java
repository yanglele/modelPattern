package com.iterator.version1;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class LunchMenu {

    private MenuItem[] menuItems;

    public LunchMenu(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public Iterator createIterator(){
        return new LunchIterator(menuItems);
    }

}
