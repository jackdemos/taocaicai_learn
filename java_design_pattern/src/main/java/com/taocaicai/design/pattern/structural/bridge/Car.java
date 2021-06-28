package com.taocaicai.design.pattern.structural.bridge;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:34:3:34
 * @description TODO
 */
public abstract class Car {
  protected Color color;

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract String getName();
}
