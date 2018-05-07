package com.iterator9.component;

/**
 * Desc:菜单组件的基类，定义了菜单与菜单项的所有方法，默认抛出异常，在子类中复写。
 * 我们希望能够为这些方法提供默认的实现，故使用抽象类，
 * 子类只需要覆盖所需要的方法即可，不使用的方法不能调用，否则抛出异常
 * 通过让组件的接口同事包含一些管理子节点与叶子节点的操作，客户就可以将组合和叶子节点一视同仁。
 * 即一个元素究竟是组合还是叶子节点，对客户是透明的。但是会失去一定的“安全性”。
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
}
