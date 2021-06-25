package com.taocaicai.design.pattern.principle.dip.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:51
 * @version: V1.0.0
 * @description: TODO
 */
public class FoodShop implements Shop {
  @Override
  public String sell() {
    return "食品购物店销售食品";
  }
}
