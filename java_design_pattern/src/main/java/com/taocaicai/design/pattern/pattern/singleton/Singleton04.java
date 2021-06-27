package com.taocaicai.design.pattern.pattern.singleton;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:40:4:40
 * @description 双重校验锁
 */
public class Singleton04 {
  //volatile 禁止指令重排序
  private volatile static Singleton04 singleton;

  private Singleton04() {}

  public static Singleton04 getInstance() {
    if (singleton == null) {
      synchronized (Singleton04.class) {
        if (singleton == null) {
          singleton = new Singleton04();
        }
      }
    }
    return singleton;
  }
}
