/*
 * BirdProxy.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */
import java.lang.reflect.Proxy;
public class BirdProxy {
    private ObjectHandler handler; 

    public void setHandler(ObjectHandler handler){
        this.handler = handler;
    }

    public Object getProxy(Object target){
        handler.setTarget(target);
        return Proxy.newProxyInstance(BirdProxy.class.getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
    }
}

