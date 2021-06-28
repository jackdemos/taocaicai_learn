package com.taocaicai.design.pattern.structural.proxy.v1;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:21:8:21
 * @description TODO
 */
public class RealSubject implements Subject  {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
