package com.taocaicai.design.pattern.principle.ocp;

/**
 * @version: V1.0
 * @author: Oakley
 * @created: 2021-06-24 4:56
 * @description: 开闭原则（Open Closed Principle，OCP）由勃兰特·梅耶（Bertrand Meyer）提出，他在 1988
 *     年的著作《面向对象软件构造》（Object Oriented Software Construction）
 *     中提出：软件实体应当对扩展开放，对修改关闭（ Software entities
 *     should be open for extension，but closedfor modification）， 这就是开闭原则的经典定义。
 *     <p>这里的软件实体包括以下几个部分： 项目中划分出的模块 类与接口 方法
 */
public class OCPrinciple {
  public static void main(String[] args) {
    AbstractSubject subject = new ASubject();
    subject.display();
  }
}
