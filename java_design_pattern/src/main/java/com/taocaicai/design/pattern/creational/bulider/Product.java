package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:32:7:32
 * @description TODO
 */
public class Product {
  private String partA;
  private String partB;
  private String partC;

  public void setPartA(String partA) {
    this.partA = partA;
  }

  public void setPartB(String partB) {
    this.partB = partB;
  }

  public void setPartC(String partC) {
    this.partC = partC;
  }

  void show() {
    System.out.println(partA+"\t"+partB+"\t"+partC);
  }
}
