package com.iterator.version2;

import com.iterator.version1.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class DinnerMenu implements Menu{

    private List<MenuItem> menuItemList;

    public DinnerMenu(List<MenuItem> menuItems){
        this.menuItemList = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayList<>().iterator();
    }
}
