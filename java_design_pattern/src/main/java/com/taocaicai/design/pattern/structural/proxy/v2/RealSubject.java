package com.taocaicai.design.pattern.structural.proxy.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:38:8:38
 * @description TODO
 */
public class RealSubject implements AbstractSubject {
  @Override
  public void request() {
    System.out.println(RealSubject.class.getSimpleName() + "对象");
  }
}
