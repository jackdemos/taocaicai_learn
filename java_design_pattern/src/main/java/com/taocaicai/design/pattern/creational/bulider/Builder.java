package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:33:7:33
 * @description TODO
 */
public abstract class Builder {
  /** 创建产品对象 */
  protected Product product = new Product();

  public abstract void buildPartA();

  public abstract void buildPartB();

  public abstract void buildPartC();
  /** 返回产品对象 */
  public Product getResult() {
    return product;
  }
}
