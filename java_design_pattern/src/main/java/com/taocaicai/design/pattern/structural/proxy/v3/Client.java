package com.taocaicai.design.pattern.structural.proxy.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:40:8:40
 * @description TODO
 */
public class Client {
  static AbstractSubject subject = null;
  static InvocationHandler invocationHandler = null;
  public static void main(String[] args) {
    invocationHandler = new DynamicProxy(new RealSubject2());

    subject =
        (AbstractSubject)
            Proxy.newProxyInstance(
                AbstractSubject.class.getClassLoader(),
                new Class[] {AbstractSubject.class},
                invocationHandler);
    subject.request();
  }
}
