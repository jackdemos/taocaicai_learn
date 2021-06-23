package com.taocaicai.design.pattern.Liskov.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 5:16
 * @version: V1.0.0
 * @description: 里氏替换原则的定义 里氏替换原则（Liskov Substitution Principle，LSP）由麻省理工学院计算机科学实验室的里斯科夫（Liskov）女士在
 *     1987 年的“面向对象技术的高峰会议”（OOPSLA）上发表的一篇文章《数据抽象和层次》（Data Abstraction and
 *     Hierarchy）里提出来的，她提出：继承必须确保超类所拥有的性质在子类中仍然成立 （Inheritance should ensure that any property
 *     proved about supertype objects also holds for subtype objects）。
 *     里氏替换原则主要阐述了有关继承的一些原则，也就是什么时候应该使用继承，什么时候不应该使用继承，
 *     以及其中蕴含的原理。里氏替换原是继承复用的基础，它反映了基类与子类之间的关系，是对开闭原则的补充， 是对实现抽象化的具体步骤的规范。
 */
public class LSPtest {
  public static void main(String[] args) {
    Bird bird1 = new Swallow();
    Animal bird2 = new BrownKiwi();
    bird1.setFlySpeed(120);
    bird2.setRunSpeed(120);
    System.out.println("如果飞行300公里：");
    try {
      System.out.println("燕子将飞行" + bird1.getFlyTime(300)+ "小时.");
      System.out.println("几维鸟将飞行" + bird2.getRunTime(300) + "小时。");
    } catch (Exception err) {
      System.out.println("发生错误了!");
    }
  }
}
