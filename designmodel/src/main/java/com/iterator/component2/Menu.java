package com.iterator.component2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Desc:菜单
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/10
 * version:
 * update:
 */

public class Menu extends MenuComponent {
    private String name;
    private String desc;
    private List<MenuComponent> menuItemList = new ArrayList<>();

    public Menu(String name,String desc){
        this.name=name;
        this.desc=desc;
    }

    public MenuComponent get(int pos){
        return menuItemList.get(pos);
    }

    public void delete(MenuComponent component){
        menuItemList.remove(component);
    }

    public void add(MenuComponent component){
        menuItemList.add(component);
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    //递归调用
    public void print(){
        Iterator<MenuComponent> iterator = menuItemList.iterator();
        while (iterator.hasNext()){
            MenuComponent menu = iterator.next();
            menu.print();
        }
    }

    public Iterator createIterator() {
        return new MenuIterator(menuItemList.iterator());
    }
}
