package com.iterator9.component2;

/**
 * Desc:组合模式：允许将对象组合成树形结构来表现整体与部分的数据结构，
 * 能够让客户以一致的方式处理个别对象以及对象组合
 *
 * 对象的组合与对象都使用一个基类，里面包含二者的公共操作。树形的节点既可以是单个对象，
 * 也可以是对象的组合
 *
 * 当你有数个对象的集合，并且它们之间有“整体/部分”关系，并且你想用一致的方式对待这些对象时，你需要该模式。
 * 整体与部分用一套接口，意味着二则会有方法的冗余，但是增加了用户使用的透明度。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/10
 * version:
 * update:
 */

public class MainTest {
    public static void main(String[] args){

        MenuComponent menus = new Menu("menus","all");

        MenuComponent lunchMenu = new Menu("lunch","meet");
        MenuComponent dinnerMenu = new Menu("dinner","noodles");

        MenuComponent snackMenu = new Menu("snake","great");

        MenuComponent lunch1 = new MenuItem("beef","delicious",1.3);
        MenuComponent lunch2 = new MenuItem("pork","good",0.3);

        MenuComponent dinner1 = new MenuItem("spaghetti","very good",2.4);
        MenuComponent dinner2 = new MenuItem("noodle","not bad",1.4);

        MenuComponent snake1 = new MenuItem("ice cream","good",2.1);
        MenuComponent snake2 = new MenuItem("apple","good too",2.4);

        lunchMenu.add(lunch1);
        lunchMenu.add(lunch2);
        dinnerMenu.add(dinner1);
        dinnerMenu.add(dinner2);
        dinnerMenu.add(snackMenu);
        snackMenu.add(snake1);
        snackMenu.add(snake2);

        menus.add(lunchMenu);
        menus.add(dinnerMenu);

        Waiter waiter = new Waiter(menus);
//        waiter.print();
        waiter.printIterator();
    }
}
