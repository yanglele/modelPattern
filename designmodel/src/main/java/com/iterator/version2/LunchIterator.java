package com.iterator.version2;

import com.iterator.version1.MenuItem;

import java.util.Iterator;

/**
 * Desc:午餐菜单迭代器，数组没有重写iterator，故需要自己实现
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class LunchIterator implements Iterator{
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

    @Override
    public void remove() {
        if(position >= menuItems.length){
            throw new ArrayIndexOutOfBoundsException(position);
        }
        for(int i=position;i<menuItems.length - 1;i++){
            menuItems[i] = menuItems[i+1];
        }
        menuItems[menuItems.length - 1] =null;
    }
}
