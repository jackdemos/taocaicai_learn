package com.taocaicai.design.pattern.pattern.simplefactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 06:14:6:14
 * @description TODO
 */
public class SimpleFactory {

  public static Product createProduct(int kind) {
    switch (kind) {
      case Const.PRODUCT_A:
        return new Shoe();
      case Const.PRODUCT_B:
        return new Clothing();
    }
    return null;
  }
}

final class Const {
  static final int PRODUCT_A = 0;
  static final int PRODUCT_B = 1;
  static final int PRODUCT_C = 2;
}
