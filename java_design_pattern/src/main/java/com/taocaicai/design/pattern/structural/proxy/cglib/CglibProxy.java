package com.taocaicai.design.pattern.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

import javax.sql.DataSource;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-07-24 04:42:4:42
 * @package com.taocaicai.design.pattern.structural.proxy.cglib
 * @description cglib动态代理实现类
 * @version: 0.0.0.1
 */
public class CglibProxy implements MethodInterceptor {

  public Object creatProxyObj(Class<?> clazz) {
    Enhancer enhancer = new Enhancer();

    enhancer.setSuperclass(clazz);

    enhancer.setCallback(this);

    return enhancer.create();
  }


  /**
   * o：cglib生成的代理对象
   * method：被代理对象方法
   * objects：方法入参
   * methodProxy: 代理方法
   *  @throws Throwable
   */
  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    System.out.println("==============cglib代理前者通知==========");
    Object object = methodProxy.invokeSuper(o, objects);
    System.out.println("==============cglib代理后者通知==========");
    return object;
  }
}
