package com.taocaicai.design.pattern.creational.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description TODO
 */
public class Singleton02 {
  private static Singleton02 singleton;

  private Singleton02() {}

  public static Singleton02 getInstance() {
    if (singleton == null) {
      singleton = new Singleton02();
    }
    return singleton;
  }
}
