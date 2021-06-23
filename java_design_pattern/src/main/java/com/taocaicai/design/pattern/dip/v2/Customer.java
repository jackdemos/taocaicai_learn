package com.taocaicai.design.pattern.dip.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:52
 * @version: V1.0.0
 * @description: TODO
 */
public class Customer {

  public void shopping(Shop shop) {
    System.out.println("客户购物中.....");
    shop.sell();
  }
}
