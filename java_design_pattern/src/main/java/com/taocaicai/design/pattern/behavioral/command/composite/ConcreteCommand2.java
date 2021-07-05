package com.taocaicai.design.pattern.behavioral.command.composite;

public class ConcreteCommand2 implements AbstractCommand {
  private CompositeReceiver receiver;

  ConcreteCommand2() {
    receiver = new CompositeReceiver();
  }

  public void execute() {
    receiver.action2();
  }
}
