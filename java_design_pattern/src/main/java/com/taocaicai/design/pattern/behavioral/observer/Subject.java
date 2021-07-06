package com.taocaicai.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:57:14:57
 * @description TODO
 */
public abstract class Subject {
  List<Observer> observerList = new ArrayList<>();

  /**
   * 添加指定观察者
   *
   * @param observer
   */
  public void add(Observer observer) {
    observerList.add(observer);
    System.out.println(observer.getClass().getSimpleName()+"\t加入监视组");
  }

  /**
   * 删除指定观察者
   *
   * @param observer
   */
  public void remove(Observer observer) {
    observerList.remove(observer);
    System.out.println(observer.getClass().getSimpleName()+"\t离开监视组");
  }

  /** 通知所有观察者 */
  public abstract void notifyObserver();
}
