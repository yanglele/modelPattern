package com.iterator.version2;

import com.iterator.version1.MenuItem;

import java.util.Iterator;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class LunchMenu implements Menu {

    private MenuItem[] menuItems;

    public LunchMenu(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new LunchIterator(menuItems);
    }
}
