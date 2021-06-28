package com.taocaicai.design.pattern.structural.bridge;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:36:3:36
 * @description 卡车
 */
public class Truck extends Car {
  @Override
  public String getName() {
    return "汽车颜色:  " + color.getColor() + "\t 汽车类型: Truck";
  }
}
