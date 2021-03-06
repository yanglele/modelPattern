package com.decorate3;

import com.decorate3.baseCafe.Beverage;
import com.decorate3.cafe.HouseBlend;
import com.decorate3.decorator.Milk;
import com.decorate3.decorator.Mocha;

/**
 * Desc:装饰者模式：动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 * 装饰着与被装饰者有着相同的超类
 * 设计原则：类应该对扩展开放，对修改关闭。我们允许类很容易扩展，在不修改现有代码的情况下，就可以搭配新的行为。而不允许修改现有代码。
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public class MainTest {

    public static void main(String[] args){
        //默认小杯测试
        HouseBlend houseBlend = new HouseBlend();
        Milk withMilk = new Milk(houseBlend);
        Mocha withMocha = new Mocha(withMilk);
        System.out.println("desc="+withMocha.getDesc());
        System.out.println("cost="+withMocha.cost());


        //大杯测试
        HouseBlend houseBlendVenti = new HouseBlend();
        houseBlendVenti.setSize(Beverage.Size.VENTI);
        Milk withMilkVenti = new Milk(houseBlendVenti);
        Mocha withMochaVenti = new Mocha(withMilkVenti);
        System.out.println("venti desc="+withMochaVenti.getDesc());
        System.out.println("venti cost="+withMochaVenti.cost());

    }
}
