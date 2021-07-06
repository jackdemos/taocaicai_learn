package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:27:14:27
 * @description 死亡状态
 */
public class Dead extends ThreadState {
  public Dead() {
    stateName = "死亡状态";
    System.out.println("当前线程处于：死亡状态.");
  }
}
