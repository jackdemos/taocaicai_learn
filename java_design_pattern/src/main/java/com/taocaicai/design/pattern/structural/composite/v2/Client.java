package com.taocaicai.design.pattern.structural.composite.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:24:6:24
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
    Composite c0 = new Composite();
    Composite c1 = new Composite();
    Component leaf1 = new Leaf("1");
    Component leaf2 = new Leaf("2");
    Component leaf3 = new Leaf("3");
    c0.add(leaf1);
    c0.add(c1);
    c1.add(leaf2);
    c1.add(leaf3);
    c0.operation();
  }
}
