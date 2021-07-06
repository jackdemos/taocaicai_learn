package com.taocaicai.design.pattern.behavioral.observer;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 15:02:15:02
 * @description 具体目标
 */
public class ConcreteSubject extends Subject {
  @Override
  public void notifyObserver() {
    System.out.println("具体目标发生改变...");
    System.out.println("--------------");
    observerList.forEach(observer -> observer.response());
  }
}
