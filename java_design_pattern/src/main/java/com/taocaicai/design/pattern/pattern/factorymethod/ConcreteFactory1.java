package com.taocaicai.design.pattern.pattern.factorymethod;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 06:34:6:34
 * @description TODO
 */
public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public Product createProduct() {
    System.out.println("具体工厂1生成-->具体产品1...");
    return new Shoe();
  }
}
