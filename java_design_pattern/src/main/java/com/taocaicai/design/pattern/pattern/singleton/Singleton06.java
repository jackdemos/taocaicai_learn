package com.taocaicai.design.pattern.pattern.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description 静态内部内单例
 */
public class Singleton06 {
  private static class SingletonHolder {
    private static final Singleton06 instance = new Singleton06();
  }

  private Singleton06() {}

  public static Singleton06 getInstance() {
    return SingletonHolder.instance;
  }
}
