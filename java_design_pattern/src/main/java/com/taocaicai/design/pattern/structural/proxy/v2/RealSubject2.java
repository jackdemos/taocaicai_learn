package com.taocaicai.design.pattern.structural.proxy.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:38:8:38
 * @description TODO
 */
public class RealSubject2 implements AbstractSubject{
    @Override
    public void request() {
    System.out.println(RealSubject2.class.getSimpleName()+"对象");
    }
}
