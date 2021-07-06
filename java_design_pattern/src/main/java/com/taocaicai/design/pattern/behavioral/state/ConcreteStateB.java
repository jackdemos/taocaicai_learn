package com.taocaicai.design.pattern.behavioral.state;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 17:09:42
 * @description 状态B
 */
public class ConcreteStateB extends State {
  @Override
  public void Handle(Context context) {
    System.out.println("当前状态是 B.");
    context.setState(new ConcreteStateA());
  }
}
