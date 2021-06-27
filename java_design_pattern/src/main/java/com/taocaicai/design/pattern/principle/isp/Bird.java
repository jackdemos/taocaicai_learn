package com.taocaicai.design.pattern.principle.isp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:23:3:23
 * @description TODO
 */
public class Bird implements IEat, IFly, ISay, IListen {
  @Override
  public void eat() {
    System.out.println("鸟会吃食物");
  }

  @Override
  public void fly() {
    System.out.println("鸟会飞");
  }

  @Override
  public void listen() {
    System.out.println("鸟可以听到声音");
  }

  @Override
  public void say() {
    System.out.println("鸟会叫");
  }

  @Override
  public IEat getInstance() {
    return new Bird();
  }
}
