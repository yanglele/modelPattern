package com.proxy11.javaReflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Desc:自己的代理类 代理规则
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBeans personBeans;

    public OwnerInvocationHandler(PersonBeans personBeans) {
        this.personBeans = personBeans;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBeans, args);
            }else if(method.getName().startsWith("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBeans,args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
