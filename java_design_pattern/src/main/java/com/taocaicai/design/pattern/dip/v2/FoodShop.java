package com.taocaicai.design.pattern.dip.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:51
 * @version: V1.0.0
 * @description: TODO
 */
public class FoodShop implements Shop {
  @Override
  public void sell() {
    System.out.println("食品购物店销售食品");
  }
}
