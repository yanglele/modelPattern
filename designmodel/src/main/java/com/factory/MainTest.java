package com.factory;

import com.factory.factory.base.Pizza;
import com.factory.factory.store.BLStore;

/**
 * Desc:
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
    }
}
