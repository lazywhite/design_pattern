/*
 * ObjectHandler.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */

import java.lang.reflect.*;
public class ObjectHandler implements InvocationHandler {
    private Interceptor interceptor = new Interceptor(); 
    private Object target;

    public void setTarget(Object obj){
        this.target = obj;
    }

	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
        Object result = null;
        interceptor.doBefore();
        method.invoke(target, args);
        interceptor.doAfter();
        return result;
	}
}

