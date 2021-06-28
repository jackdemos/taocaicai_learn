package com.taocaicai.design.pattern.structural.adapter.object_adapter;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:00:3:00
 * @description 适配者接口
 */
public class Adaptee {
  void specificRequest() {
    System.out.println("适配者中的业务代码被调用！");
  }
}
