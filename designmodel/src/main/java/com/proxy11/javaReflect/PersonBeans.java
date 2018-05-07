package com.proxy11.javaReflect;

/**
 * Desc: java 动态代理的接口
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public interface PersonBeans {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
