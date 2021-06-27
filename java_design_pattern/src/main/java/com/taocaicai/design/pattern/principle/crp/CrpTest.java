package com.taocaicai.design.pattern.principle.crp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:46:3:46
 * @description 合成复用原则（Composite Reuse Principle，CRP）又叫组合/聚合复用原则（Composition/Aggregate Reuse
 *     Principle，CARP）。它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
 *     <p>如果要使用继承关系，则必须严格遵循里氏替换原则。合成复用原则同里氏替换原则相辅相成的，两者都是开闭原则的具体实现规范。
 */
public class CrpTest {
  public static void main(String[] args) {
    Car car = new GasolineCar(new White());
    car.move();

    car = new ElectricCar(new Black());
    car.move();
  }
}
