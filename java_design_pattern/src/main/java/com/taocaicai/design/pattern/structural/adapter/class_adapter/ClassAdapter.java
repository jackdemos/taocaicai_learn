package com.taocaicai.design.pattern.structural.adapter.class_adapter;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:00:3:00
 * @description 类适配器类
 */
public class ClassAdapter extends Adaptee implements Target {
  @Override
  public void request() {
    specificRequest();
  }
}
