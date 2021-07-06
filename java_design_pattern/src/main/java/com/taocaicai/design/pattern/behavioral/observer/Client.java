package com.taocaicai.design.pattern.behavioral.observer;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:45:14:45
 * @description 观察者模式
 */
public class Client {
  public static void main(String[] args) {
      Subject subject = new ConcreteSubject();

      Observer observerA = new ConcreteObserverA();
      Observer observerB = new ConcreteObserverB();
      Observer observerC = new ConcreteObserverC();

      subject.add(observerA);
      subject.add(observerB);


      subject.notifyObserver();

      subject.add(observerC);

      subject.remove(observerB);
      subject.notifyObserver();


  }
}
