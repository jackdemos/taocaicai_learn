package com.taocaicai.design.pattern.structural.bridge;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:37:3:37
 * @description 公交车
 */
public class Bus extends Car {
  @Override
  public String getName() {
    return "汽车颜色: "+color.getColor() + "\t 汽车类型: Bus";
  }
}
