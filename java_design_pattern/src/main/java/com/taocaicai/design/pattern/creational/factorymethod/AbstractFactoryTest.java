package com.taocaicai.design.pattern.creational.factorymethod;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 06:36:6:36
 * @description TODO
 */
public class AbstractFactoryTest {
  public static void main(String[] args) {
    Product a;
    AbstractFactory af;
    af = (AbstractFactory) create("ConcreteFactory2");
    a = af.createProduct();
    a.show();
  }

  public static Object create(String factoryName) {
    try {
      String className="com.taocaicai.design.pattern.pattern.factorymethod."+factoryName;
      Class<?> aClass = Class.forName(className);
      Object o = aClass.newInstance();
      return o;
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
      e.printStackTrace();
    }
    return null;
  }
}
