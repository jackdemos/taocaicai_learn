package com.taocaicai.design.pattern.dip.v1;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:52
 * @version: V1.0.0
 * @description: TODO
 */
public class Customer2 {

  public void shopping(FoodShop shop) {
    System.out.println("客户购物中.....");
    shop.sell();
  }
}
