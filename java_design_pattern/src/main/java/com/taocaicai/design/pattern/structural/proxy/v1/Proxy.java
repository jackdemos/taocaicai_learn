package com.taocaicai.design.pattern.structural.proxy.v1;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:30:8:30
 * @description TODO
 */
public class Proxy implements Subject {
  private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
