package com.strategy1;

import com.strategy1.model.Squeak;

/**
 * Desc:策略模式，面对经常变化的数据对象，使用模块的组合来代替简单的继承与接口
 * idea:
 * 1.分离出易变和不变的元素，易变的抽为接口，以便以后改动与扩充，不变的写在类中。
 * 2.针对接口编程，而不是针对实现编程（eg：FlyBehavior）,利用多态的优点
 * 3.多用组合，少用继承，增加系统的弹性
 * 定义：策略模式定义了算法簇，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/10
 * version:
 * update:
 */

public class DuckMain {

    public static void main(String[] args){

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();


        PlatypusDuck platypusDuck = new PlatypusDuck();
        platypusDuck.display();
        platypusDuck.swim();
        platypusDuck.performQuack();
        platypusDuck.performFly();


        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.setQuackBehavior(new Squeak());
    }
}
