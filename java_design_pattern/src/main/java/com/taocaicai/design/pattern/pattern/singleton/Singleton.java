package com.taocaicai.design.pattern.pattern.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description TODO
 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {}

  public static Singleton getInstance() {
    return singleton;
  }
}
