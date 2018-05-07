package com.iterator9.version2;

import com.iterator9.version1.DinnerMenu;
import com.iterator9.version1.LunchMenu;
import com.iterator9.version1.MenuItem;
import com.iterator9.version1.Waiter;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:迭代器模式
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */

public class MainTest {

    public static void main(String[] args){

        MenuItem dinner1 = new MenuItem("banana","fruits",1.2);
        MenuItem dinner2 = new MenuItem("apple","fruits",2.2);
        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(dinner1);
        menuItemList.add(dinner2);
        DinnerMenu dinnerMenu = new DinnerMenu(menuItemList);

        MenuItem lunch1 = new MenuItem("beef","meat",3.2);
        MenuItem lunch2 = new MenuItem("pork","meat",2.5);
        MenuItem[] lunchMenus = new MenuItem[]{lunch1,lunch2};
        LunchMenu lunchMenu = new LunchMenu(lunchMenus);

        Waiter waiter = new Waiter(dinnerMenu,lunchMenu);
        waiter.printMenu();
    }
}
