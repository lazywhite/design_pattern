/*
 * Proxy.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */
import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class Proxy implements MethodInterceptor{
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }
     
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable{
        Object result= null;
        System.out.println("前置代理");
        result = proxy.invokeSuper(obj, args);
        System.out.println("后置代理");
        return result;
    }
}

