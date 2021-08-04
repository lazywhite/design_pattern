/*
 * CommandPatternDemo.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 *
 * 不仅参数可以改变, 具体的函数体也可以变
 */

public class CommandPatternDemo {
     
    public static void main(String[] args){
        System.out.println("--------- first ---------");
        ProcessArray pa = new ProcessArray();
        int[] target = {1, -3, 4, 6};
        pa.each(target, new Command(){
            @Override
            public void process(int[] target){
                for(int tmp: target){
                    System.out.println(tmp); //仅仅打印
                }
            }
        });
        System.out.println("--------- second ---------");
        pa.each(target, new Command(){
            @Override
            public void process(int[] target){
                int result = 0;
                for(int tmp: target){
                    result += tmp;     
                }
                System.out.println(result);
            }
        });
    }
}

