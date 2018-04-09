package com.factory.abstractFactory;

import com.factory.abstractFactory.base.Pizza;
import com.factory.abstractFactory.store.BLStore;
import com.factory.abstractFactory.store.NYStore;

/**
 * Desc:大部分代码复制于simpleFactory
 * 仅增加了原料接口
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
