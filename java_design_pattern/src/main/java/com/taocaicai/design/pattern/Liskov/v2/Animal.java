package com.taocaicai.design.pattern.Liskov.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 5:39
 * @version: V1.0.0
 * @description: TODO
 */
public class Animal {
   double runSpeed;

  public double getRunTime(double distance) {
    return (distance/runSpeed);
  }

  public void setRunSpeed(double runSpeed) {
    this.runSpeed = runSpeed;
  }
}
