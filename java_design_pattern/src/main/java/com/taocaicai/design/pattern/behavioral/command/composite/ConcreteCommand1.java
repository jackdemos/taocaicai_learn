package com.taocaicai.design.pattern.behavioral.command.composite;

public class ConcreteCommand1 implements AbstractCommand {
  private CompositeReceiver receiver;

  ConcreteCommand1() {
    receiver = new CompositeReceiver();
  }

  public void execute() {
    receiver.action1();
  }
}
