package com.taocaicai.design.pattern.behavioral.chain;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 16:50:09
 * @description 责任链
 * 模式了请假审批流程
 */
public class Client {
  public static void main(String[] args) {
    //组装责任链
    Handler director = new Director();
    director.setNext(new Manager());
    director.setNext(new GeneralManager());
    System.out.println("开始执行责任链条");
    director.HandlerRequest(2);
  }
}
