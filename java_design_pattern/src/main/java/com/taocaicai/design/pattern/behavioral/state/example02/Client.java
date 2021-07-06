package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:28:14:28
 * @description 模拟线程运行状态
 */
public class Client {
  public static void main(String[] args) {
      ThreadContext context = new ThreadContext();
      context.start();
      context.getCPU();
      context.suspend();
      context.resume();
      context.getCPU();
      context.stop();
  }
}
