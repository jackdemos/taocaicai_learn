package com.taocaicai.design.pattern.creational.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description TODO
 */
public class Singleton03 {
  private static Singleton03 singleton;

  private Singleton03() {}

  public static synchronized Singleton03 getInstance() {
    if (singleton == null) {
      singleton = new Singleton03();
    }
    return singleton;
  }
}
