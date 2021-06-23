package com.taocaicai.design.pattern.dip.v1;

import com.taocaicai.design.pattern.dip.v2.Shop;

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
