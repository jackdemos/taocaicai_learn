package com.taocaicai.design.pattern.pattern.abstractfactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:16:7:16
 * @description TODO
 */
public class HaierFactory implements AbstractFactory {
  @Override
  public TV createTV() {
    System.out.println("生产海尔电视机");
    return new HaierTV();
  }

  @Override
  public Refrigerator createRefrigerator() {
    System.out.println("生产海尔电冰箱");
    return new HaierRefrigerator();
  }
}
