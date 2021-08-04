/*
 * Adapter02.java
 * Copyright (C) 2017 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 *
 * 基于对象的的适配器模式(通过依赖注入实现)
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

class Adapter implements Target{
    private Origin origin;
    public Adapter(Origin origin){
        this.origin = origin;
    }
    @Override
    public void request(){
        System.out.println("开始调用原有系统");
        this.origin.specificRequest();
    }
}

public class Adapter02 {
     
    public static void main(String[] args){
        Target adapter = new Adapter(new Origin());
        adapter.request();
    }
}

