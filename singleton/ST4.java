/*
 * Singleton.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 * 线程安全版, 可以按需创建, 考虑效率
 */

class Singleton {
    private static volatile Singleton singleton = null;
     
    private Singleton(){}
     
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }    
}

public class  ST4{
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}


