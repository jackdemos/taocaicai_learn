package com.taocaicai.design.pattern.dip.v1;

import com.taocaicai.design.pattern.dip.v2.Shop;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:52
 * @version: V1.0.0
 * @description: TODO
 */
public class Customer {

  public void shopping(DogShop shop) {
    System.out.println("客户购物中.....");
    shop.sell();
  }
}
