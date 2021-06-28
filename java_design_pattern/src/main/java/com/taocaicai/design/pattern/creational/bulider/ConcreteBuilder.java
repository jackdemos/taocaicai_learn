package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:34:7:34
 * @description TODO
 */
public class ConcreteBuilder extends Builder {

  @Override
  public void buildPartA() {
    product.setPartA("建造 PartA");
  }

  @Override
  public void buildPartB() {
    product.setPartB("建造 PartB");
  }

  @Override
  public void buildPartC() {
    product.setPartC("建造 PartC");
  }
}
