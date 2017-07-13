/*
 * Adapter01.java
 * Copyright (C) 2017 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 *
 * 当新系统所需的接口跟之前的接口不一致时, 通过适配器来完成兼容
 * 基于类的适配器模式(新建一个实现新接口, 继承于原实现的类)
 *
 */

//原有系统的实现
class Origin{
    public void specificRequest(){
        System.out.println("原有系统实现");
    }
}

//客户希望的接口
interface Target{
    public void request();
}

class Adapter extends Origin implements Target{
    @Override
    public void request(){
        System.out.println("开始调用原有系统");
        super.specificRequest();
    }
}

public class Adapter01 {
     
    public static void main(String[] args){
        Target adapter = new Adapter();
        adapter.request();
    }
}

