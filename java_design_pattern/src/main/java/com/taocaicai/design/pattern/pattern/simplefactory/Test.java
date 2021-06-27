package com.taocaicai.design.pattern.pattern.simplefactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 06:20:6:20
 * @description TODO
 */
public class Test {
  public static void main(String[] args) {

    Product product = SimpleFactory.createProduct(Const.PRODUCT_A);
    product.show();


    product = SimpleFactory.createProduct(Const.PRODUCT_B);
    product.show();
  }
}
