package com.proxy11.javaReflect;

/**
 * Desc:动态代理类的具体实现
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/30
 * version:
 * update:
 */

public class PersonBeanImpl implements PersonBeans {

    private String name;
    private String gender;
    private String interests;
    private int rating;//总分
    private int ratingCount;//投票人数

    public PersonBeanImpl(String name ,String gender ,String interests){
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0){
            return 0;
        }else {
            return rating/ratingCount;
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.ratingCount++;
        this.rating+=rating;
    }
}
