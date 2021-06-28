package com.taocaicai.design.pattern.structural.facade;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 05:11:5:11
 * @description 门面模式，是提供一个统一窗口
 */
public class Facade {
  SubSystem s1 = new SubSystem();
  SubSystem2 s2 = new SubSystem2();

  public void method() {
    s1.method();
    s2.method();
  }
}
