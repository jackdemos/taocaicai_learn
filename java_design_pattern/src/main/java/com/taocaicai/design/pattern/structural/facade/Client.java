package com.taocaicai.design.pattern.structural.facade;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 05:17:5:17
 * @description
 *     外观（Facade）模式又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
 *     该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性
 */
public class Client {
  public static void main(String[] args) {
    Facade facade = new Facade();
    facade.method();
  }
}
