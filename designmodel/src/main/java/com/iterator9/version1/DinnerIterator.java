package com.iterator9.version1;

import java.util.List;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class DinnerIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position;

    public DinnerIterator(List<MenuItem> items){
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= 0 && position < menuItems.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
