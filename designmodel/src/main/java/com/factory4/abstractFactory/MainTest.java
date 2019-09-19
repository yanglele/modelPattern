package com.factory4.abstractFactory;

import com.factory4.abstractFactory.base.Pizza;
import com.factory4.abstractFactory.store.BLStore;
import com.factory4.abstractFactory.store.NYStore;

/**
 * Desc:大部分代码复制于simpleFactory
 * 仅增加了原料接口
 * 工厂模式使用类的继承，抽象工厂使用对象的组合
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class MainTest {

    public static void main(String[] args){
        BLStore blStore = new BLStore();
        blStore.orderPizza(Pizza.TYPE.CHEESE);

        NYStore nyStore = new NYStore();
        nyStore.orderPizza(Pizza.TYPE.CLAM);
    }
}
