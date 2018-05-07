package com.factory4.abstractFactory.base;

import com.factory4.abstractFactory.source.material.Cheese;
import com.factory4.abstractFactory.source.material.Dough;
import com.factory4.abstractFactory.source.material.Sauce;

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
    protected Cheese cheese;//奶酪
    protected Sauce sauce;//酱包
    protected Dough dough;//面团


    public abstract void prepare();
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
