package com.iterator9.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:迭代器模式：提供一种方法顺序访问一个聚合对象的各个元素，而不暴露内部的表示形式。
 * 设计原则：一个类应该只有一个引起变化的原因
 *  当一个模块或者一个类被设计为只支持一组相关功能时，我们说它具有高内聚
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
