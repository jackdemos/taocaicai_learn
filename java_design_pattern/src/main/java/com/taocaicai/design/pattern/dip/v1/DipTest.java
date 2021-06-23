package com.taocaicai.design.pattern.dip.v1;

/**
 * @author: Oakley
 * @created: 2021-06-24 6:49
 * @version: V1.0.0
 * @description: 依赖倒置原则的原始定义为：高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节， 细节应该依赖抽象（High level modules
 *     shouldnot depend upon low level modules.Both should depend upon abstractions.Abstractions
 *     should not depend upon details. Details should depend upon
 *     abstractions）。其核心思想是：要面向接口编程，不要面向实现编程。
 */
public class DipTest {
  public static void main(String[] args) {
    /*以下是面向实现编程没有灵活性*/
    Customer customer = new Customer();
    customer.shopping(new DogShop());

    Customer2 customer2 = new Customer2();
    customer2.shopping(new FoodShop());
  }
}
