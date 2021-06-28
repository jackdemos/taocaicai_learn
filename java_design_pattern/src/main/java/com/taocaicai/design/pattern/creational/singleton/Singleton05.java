package com.taocaicai.design.pattern.creational.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description 静态代码块单例
 */
public class Singleton05 {
  private static Singleton05 singleton;

  static {
    singleton = new Singleton05();
  }

  private Singleton05() {}

  public static Singleton05 getInstance() {
    return singleton;
  }
}
