package com.taocaicai.design.pattern.structural.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:35:8:35
 * @description TODO
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;
    public  DynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
