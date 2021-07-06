package com.taocaicai.design.pattern.behavioral.mediator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 15:57:15:57
 * @description TODO
 */
public abstract class Colleague {
  protected Mediator mediator;

  public void setMedium(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receive();

  public abstract void send();
}
