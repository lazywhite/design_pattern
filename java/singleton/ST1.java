/*
 * Singleton.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 * 饿汉式, 第一次引用该类就创建, 而不管实际是否要创建
 */

class Singleton {
    private static Singleton singleton = new Singleton();      
	public Singleton() {
	}
    public static  Singleton getSingleton(){
        return singleton;
    }
}

public class  ST1{
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}


