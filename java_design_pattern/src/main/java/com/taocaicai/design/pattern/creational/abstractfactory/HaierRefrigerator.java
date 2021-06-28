package com.taocaicai.design.pattern.creational.abstractfactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:11:7:11
 * @description TODO
 */
public class HaierRefrigerator implements Refrigerator {
  @Override
  public void store() {
    System.out.println("海尔电冰箱");
  }
}
