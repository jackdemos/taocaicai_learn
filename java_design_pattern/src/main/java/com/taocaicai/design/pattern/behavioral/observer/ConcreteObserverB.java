package com.taocaicai.design.pattern.behavioral.observer;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 15:01:15:01
 * @description 具体观察者B
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("观察主体发生的变化 ");
    }
}
