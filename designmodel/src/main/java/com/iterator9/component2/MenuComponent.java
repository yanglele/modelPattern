package com.iterator9.component2;

import java.util.Iterator;

/**
 * Desc:菜单与菜单项的基础组件
 * 我们希望能够为这些方法提供默认的实现，故使用抽象类，
 * 子类只需要覆盖所需要的方法即可，不使用的方法不能调用，否则抛出异常
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/10
 * version:
 * update:
 */

public abstract class MenuComponent {

    public MenuComponent get(int num){
        throw new UnsupportedOperationException();
    }

    public void delete(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDesc(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
