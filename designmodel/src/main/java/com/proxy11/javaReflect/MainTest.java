package com.proxy11.javaReflect;

import java.lang.reflect.Proxy;

/**
 * Desc:
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class MainTest {

    //获得自己的代理对象
    private static PersonBeans getOwnerInvocation(PersonBeans personBeans){
       return  (PersonBeans)Proxy.newProxyInstance(personBeans.getClass().getClassLoader(),
                personBeans.getClass().getInterfaces(),new OwnerInvocationHandler(personBeans));
    }

    //获得他人的代理对象
    private static PersonBeans getOthersInvocation(PersonBeans personBeans){
        return (PersonBeans) Proxy.newProxyInstance(personBeans.getClass().getClassLoader(),
                personBeans.getClass().getInterfaces(),new OthersInvocationHandler(personBeans));
    }

    public static void main(String[] args){
        PersonBeans yang = new PersonBeanImpl("yy","male","Java");
        PersonBeans ming = new PersonBeanImpl("mm","female","game");

        PersonBeans yangOwner = getOwnerInvocation(yang);
        PersonBeans yangOther = getOthersInvocation(yang);

        System.out.println(yangOwner.getName());
        yangOwner.setInterests("Android");
        try {
            yangOwner.setHotOrNotRating(3);
        }catch (Exception e){
            System.out.println("You can not set ratting yourself!");
        }

        System.out.println(yangOther.getName());
        try {
            yangOther.setInterests("PHP");
        }catch (Exception e){
            System.out.println("You can not alter others info!");
        }
        yangOther.setHotOrNotRating(3);
    }
}
