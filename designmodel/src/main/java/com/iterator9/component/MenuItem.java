package com.iterator9.component;

/**
 * Desc:菜单项
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/10
 * version:
 * update:
 */

public class MenuItem extends MenuComponent {

    private String name;
    private String desc;
    private double price;

    public MenuItem(String name,String desc,double price){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public double getPrice(){
        return price;
    }

    public void print(){
        System.out.println("menuItem:name-"+name+"  desc-"+desc+"  price-"+price);
    }
}
