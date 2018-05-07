package com.iterator9.version2;

import java.util.Iterator;

/**
 * Desc:我们使用java.util的iterator，arraylist实现了iterator，故不需要此类
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/8
 * version:
 * update:
 */
@Deprecated
public class DinnerIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
