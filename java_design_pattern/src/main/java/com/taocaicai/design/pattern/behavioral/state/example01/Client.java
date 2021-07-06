package com.taocaicai.design.pattern.behavioral.state.example01;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:06:14:06
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
    ScoreContext context = new ScoreContext();
    System.out.println("学生成绩状态测试：");
    context.add(10);
    context.add(30);
    context.add(25);
    context.add(-10);
    context.add(35);
    context.add(-20);
    context.add(25);
  }
}
