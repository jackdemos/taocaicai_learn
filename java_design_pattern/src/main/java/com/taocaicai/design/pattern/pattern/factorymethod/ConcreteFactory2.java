package com.taocaicai.design.pattern.pattern.factorymethod;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 06:34:6:34
 * @description TODO
 */
public class ConcreteFactory2 implements AbstractFactory {
  @Override
  public Product createProduct() {
    System.out.println("具体工厂2生成-->具体产品2...");
    return new Clothing();
  }
}
