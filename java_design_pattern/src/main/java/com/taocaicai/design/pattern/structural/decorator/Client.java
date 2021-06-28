package com.taocaicai.design.pattern.structural.decorator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:21:4:21
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
    Component component = new ConcreteComponent();
    component.operation();
    System.out.println("-----------------开始穿衣服----------------");
    Component component1 = new ConcreteDecorator(component);
    component1.operation();
  }
}
