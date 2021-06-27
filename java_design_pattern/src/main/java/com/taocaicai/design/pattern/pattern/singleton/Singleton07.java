package com.taocaicai.design.pattern.pattern.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description  Effective Java作者Josh Bloch 提倡的方式
 * 枚举单例   能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 */
public enum Singleton07 {
  INSTANCE;

  public static Singleton07 getInstance() {
    return INSTANCE;
  }
}
