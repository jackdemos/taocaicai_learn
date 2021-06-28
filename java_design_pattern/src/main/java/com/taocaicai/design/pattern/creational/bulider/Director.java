package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:37:7:37
 * @description TODO
 */
public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public Product construct() {
    builder.buildPartA();
    builder.buildPartB();
    builder.buildPartC();
    return builder.getResult();
  }
}
