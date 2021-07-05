package com.taocaicai.design.pattern.behavioral.state;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 17:08:11
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
      Context context = new Context();    //创建环境
      context.Handle();    //处理请求
      context.Handle();
      context.Handle();
      context.Handle();
  }
}
