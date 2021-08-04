/*
 * Singleton.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 *
 * 基于枚举的单例, 线程安全, 自己处理序列化
 * 缺点是无法继承类, 实现接口等
 *
 *  传统单例如果实现了serializable接口, 则它不再是单例的了, 因为可以通过反
 *  序列化得到多个对象, 枚举没有这个缺点
 */

enum Singleton {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class  ST6{
    public static void main(String[] args){
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        s1.setName("bob");
        System.out.println(s1 == s2);
        System.out.println(s2.getName());
    }
}


