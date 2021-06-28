package com.taocaicai.design.pattern.structural.composite.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:21:6:21
 * @description 树叶组件
 */
public class Leaf implements Component {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println("树叶" + name + "：被访问！");
  }
}
