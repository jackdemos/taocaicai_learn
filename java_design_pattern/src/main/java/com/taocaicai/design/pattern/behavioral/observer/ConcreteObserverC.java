package com.taocaicai.design.pattern.behavioral.observer;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 15:01:15:01
 * @description 具体观察者C
 */
public class ConcreteObserverC implements Observer {
  int cont;

  @Override
  public void response() {

    cont++;
    System.out.println("具体观察者3作出反应！"+cont);
  }
}
