package com.iterator.version1;



/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class LunchIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public LunchIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= 0 && position < menuItems.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
