package com.taocaicai.design.pattern.Liskov.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 5:40
 * @version: V1.0.0
 * @description: TODO
 */
public class Bird extends Animal {
  double flySpeed;

  public void setFlySpeed(double flySpeed) {
    this.flySpeed = flySpeed;
  }

  public double getFlyTime(double distance) {
    return (distance / flySpeed);
  }
}
