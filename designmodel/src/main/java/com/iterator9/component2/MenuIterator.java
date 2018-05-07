package com.iterator9.component2;

import java.util.Iterator;
import java.util.Stack;

/**
 * Desc:菜单迭代器 递归
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/11
 * version:
 * update:
 */

public class MenuIterator implements Iterator<MenuComponent>{

    Stack stack = new Stack();//存放iterator

    public MenuIterator(Iterator iterator){
        stack.add(iterator);
    }

    @Override
    public boolean hasNext() {

        if(stack.isEmpty()){
            return false;
        }else {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            if(iterator.hasNext()){
                return true;
            }else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            MenuComponent menuComponent = iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
