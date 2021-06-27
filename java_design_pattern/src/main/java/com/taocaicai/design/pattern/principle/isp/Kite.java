package com.taocaicai.design.pattern.principle.isp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:22:3:22
 * @description TODO
 */
public class Kite implements IFly {
  @Override
  public void fly() {
    System.out.println("风筝会飞");
  }
}
