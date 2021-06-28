package com.taocaicai.design.pattern.structural.adapter.object_adapter;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:00:3:00
 * @description 类适配器类
 */
public class ObjectAdapter implements Target {
  private Adaptee adaptee;

  public ObjectAdapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }
}
