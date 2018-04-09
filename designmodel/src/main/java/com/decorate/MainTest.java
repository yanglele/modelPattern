package com.decorate;

import com.decorate.baseCafe.Beverage;
import com.decorate.cafe.HouseBlend;
import com.decorate.decorator.Milk;
import com.decorate.decorator.Mocha;

/**
 * Desc:装饰者模式
 * 装饰着与被装饰者有着相同的超类
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
