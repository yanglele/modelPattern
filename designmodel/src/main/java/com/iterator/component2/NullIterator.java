package com.iterator.component2;

import java.util.Iterator;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/11
 * version:
 * update:
 */

public class NullIterator implements Iterator {

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
        throw new UnsupportedOperationException();
    }
}
