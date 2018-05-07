package com.proxy11.javaReflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Desc:他人访问时 代理规则
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class OthersInvocationHandler implements InvocationHandler {

    private PersonBeans personBeans;

    public OthersInvocationHandler(PersonBeans personBeans){
        this.personBeans = personBeans;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBeans,args);
            }else if(method.getName().startsWith("setHotOrNotRating")){
                return method.invoke(personBeans,args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
