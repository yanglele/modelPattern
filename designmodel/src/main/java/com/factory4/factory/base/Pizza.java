package com.factory4.factory.base;

import java.util.List;

/**
 * Desc:披萨基类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public abstract class Pizza {

    public enum TYPE {CHEESE,CLAM}

    protected String name;//名称
    protected String flour;//面团
    protected String sauce;//酱包
    protected List<String> toppings;//佐料


    public void prepare(){
        System.out.println("I am preparing!");
    }
    public void cook(){
        System.out.println("I am cooking!");
    }
    public void cut(){
        System.out.println("I am cutting!");
    }
    public void box(){
        System.out.println("I am boxing!");
    }
}
