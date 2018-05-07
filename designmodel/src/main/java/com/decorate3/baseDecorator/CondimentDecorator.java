package com.decorate3.baseDecorator;

import com.decorate3.baseCafe.Beverage;

/**
 * Desc:装饰基类，继承Beverage是为了保持装饰类与被装饰者类型一致，而不是为了使用其方法。
 * 装饰者和被装饰者需要有相同的基类。
 * 装饰者模式使用组合代替继承来为对象添加新的功能，在装饰的过程中赋予对象新的功能。而不是使用对象的继承。
 * 继承是编译时添加新的行为，组合则是在运行时添加新的行为
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2018/3/24
 * version:
 * update:
 */

public abstract class CondimentDecorator extends Beverage{

    public abstract String getDesc();//我们需要获得调料的信息，故设置子类必须重写该方法

}
