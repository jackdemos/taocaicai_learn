package com.taocaicai.design.pattern.structural.decorator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:18:4:18
 * @description 抽象装饰角色
 */
public class Decorator implements Component {
  private  Component component;
  Decorator(Component component){
    this.component=component;
  }
  @Override
  public void operation() {
    component.operation();
  }
}
