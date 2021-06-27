package com.taocaicai.design.pattern.principle.isp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:19:3:19
 * @description TODO
 */
public class Person implements IEat, ISay, IListen {
  @Override
  public void eat() {
    System.out.println("人会吃饭");
  }

  @Override
  public void listen() {
    System.out.println("人可以听到声音");
  }

  @Override
  public void say() {
    System.out.println("人会说话");
  }

  @Override
  public IEat getInstance() {
    return new Person();
  }
}
