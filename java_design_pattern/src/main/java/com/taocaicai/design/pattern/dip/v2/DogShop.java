package com.taocaicai.design.pattern.dip.v2;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:50
 * @version: V1.0.0
 * @description: TODO
 */
public class DogShop implements Shop {
  @Override
  public void sell() {
    System.out.println("宠物店销售宠物用品");
  }
}
