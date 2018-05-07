package com.singleton5;

/**
 * Desc:单例模式
 * Author:yl
 * Email:yangle06@anjuke.com
 * data:2017/9/19
 * version:
 * update:
 */

public class SingletonMode1 {
    private SingletonMode1(){}
    private static final SingletonMode1 instance=new SingletonMode1();
    public static SingletonMode1 getInstance(){
        return instance;
    }
}

class SingletonMode2{
    private static SingletonMode2 instance;
    private SingletonMode2(){}
    public synchronized static SingletonMode2 getInstance(){
        if(instance == null){
            instance = new SingletonMode2();
        }
        return instance;
    }
}

class SingletonMode3{
    private SingletonMode3(){}
    private volatile static SingletonMode3 instance;
    public static SingletonMode3 getInstance(){
        if(instance == null){
            synchronized (SingletonMode3.class){
                if(instance == null){
                    instance=new SingletonMode3();
                }
            }
        }
        return instance;
    }
}

class SingletonMode4{
    private SingletonMode4(){}
    private static class GetSingletonInstance{
        private static final SingletonMode4 INSTANCE=new SingletonMode4();
    }
    public static SingletonMode4 getInstance(){
        return GetSingletonInstance.INSTANCE;
    }
}
