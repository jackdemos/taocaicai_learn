package com.taocaicai.design.pattern.structural.decorator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:20:4:20
 * @description TODO
 */
public class ConcreteDecorator extends Decorator {
  ConcreteDecorator(Component component) {
    super(component);
  }

  @Override
  public void operation() {
    super.operation();
    addedFunction();
  }

  public void addedFunction() {
    System.out.println("穿了一件红色新衣服");
  }
}
