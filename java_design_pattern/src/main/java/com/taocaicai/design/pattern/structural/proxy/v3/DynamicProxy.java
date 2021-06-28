package com.taocaicai.design.pattern.structural.proxy.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:35:8:35
 * @description TODO
 */
public class DynamicProxy<T> implements InvocationHandler {
  /** InvocationHandler持有的被代理对象 */
  private T target;

  public DynamicProxy(T target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("代理执行" + method.getName() + "方法");
    MonitorUtil.start();
    Object result = method.invoke(target, args);
    MonitorUtil.finish(method.getName());
    return result;
  }
}
