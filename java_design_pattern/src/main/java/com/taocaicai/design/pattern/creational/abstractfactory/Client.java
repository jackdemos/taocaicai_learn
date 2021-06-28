package com.taocaicai.design.pattern.creational.abstractfactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:18:7:18
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = new HaierFactory();
    abstractFactory.createTV();
    abstractFactory.createRefrigerator();
  }
}
