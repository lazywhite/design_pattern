/*
 * AOPTest.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 *
 * 动态代理
 *      被代理对象需要实现某些接口
 *      代理类无需实现被代理对象的接口, 比较灵活
 */

public class AOPDemo {
    public static void main(String[] args){
        Bird bird = new Bird();
        ObjectHandler handler = new ObjectHandler();
        BirdProxy bProxy = new BirdProxy();
        bProxy.setHandler(handler);
        CanFly proxy = (CanFly) bProxy.getProxy(bird);
        proxy.fly();
    }
}

