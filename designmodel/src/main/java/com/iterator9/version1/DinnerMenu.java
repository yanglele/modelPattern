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

public class DinnerMenu {
    private List<MenuItem> menuItems;

    public DinnerMenu(List<MenuItem> menuItems){
        this.menuItems= menuItems;
    }

    public Iterator createIterator(){
        return new DinnerIterator(menuItems);
    }
}
