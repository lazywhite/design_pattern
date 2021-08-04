/*
 * Singleton.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 * 静态内部类写法
 *   静态内部类在外部类被加载时不会被加载, 被调用时才加载
 */

class Singleton {
    private static class Holder {
        private static Singleton singleton = new Singleton();
    }
     
    private Singleton(){}
         
    public static Singleton getSingleton(){
        return Holder.singleton;
    }
}
public class  ST5{
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}


