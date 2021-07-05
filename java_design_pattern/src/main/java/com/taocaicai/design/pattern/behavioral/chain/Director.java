package com.taocaicai.design.pattern.behavioral.chain;
/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 16:50:09
 * @description 部门主管
 */
public class Director extends Handler {
  @Override
  public void HandlerRequest(int day) {
    if (day <= 2) {
      System.out.println("您的请假被主管批准了");
    } else {
      if (getNext() != null) {
        getNext().HandlerRequest(day);
      } else {
        System.out.println("没有人处理该请求！");
      }
    }
  }
}
