package com.taocaicai.design.pattern.creational.abstractfactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:14:7:14
 * @description 格立工厂
 */
public class GeliFactory implements AbstractFactory {
  @Override
  public TV createTV() {
    System.out.println("生产格立电视机");
    return new GeliTV();
  }

  @Override
  public Refrigerator createRefrigerator() {
    System.out.println("生产格立电冰箱");
    return new GeliRefrigerator();
  }
}
