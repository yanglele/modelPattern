package com.template8;

/**
 * Desc:
 * 定义：在一个方法中定义一个算法的骨架，而将一些步骤延迟在子类中。模板方法使得子类可以再不改变算法结构的情况下，
 * 重新定义算法的某些步骤。
 * 模板模式，将固定的步骤封装在基类中，将相同的方法写在基类中，
 * 差异的方法设为abstract，强制子类去实现。也可设置些hook方法，用于操作处理流程，根据子类的实现来决定
 * eg:java的排序算法 sort(),给定了排序的算法步骤，我们只需实现compareTo即可。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/4/7
 * version:
 * update:
 */

public class MainTest {
    public static void main(String[] args){
        Tee tee = new Tee();
        tee.prepareMaterial();

        Coffee coffee = new Coffee();
        coffee.prepareMaterial();
    }
}
