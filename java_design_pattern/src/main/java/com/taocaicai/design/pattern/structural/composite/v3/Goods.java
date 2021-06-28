package com.taocaicai.design.pattern.structural.composite.v3;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:33:6:33
 * @description 商品
 */
public class Goods implements Articles {
  private String name; // 名字
  private int quantity; // 数量
  private float unitPrice; // 单价

  public Goods(String name, int quantity, float unitPrice) {
    this.name = name;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public float calculation() {
    return quantity * unitPrice;
  }

  public void show() {
    System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
  }
}
