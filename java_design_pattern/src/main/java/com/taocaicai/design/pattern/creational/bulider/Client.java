package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:26:7:26
 * @description 建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，
 *     这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离， 即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 *     <p>该模式的主要优点如下： 1. 封装性好，构建和表示分离。 2. 扩展性好，各个具体的建造者相互独立，有利于系统的解耦。 3.
 *     客户端不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其它模块产生任何影响，便于控制细节风险。
 *     <p>其缺点如下： 1. 产品的组成部分必须相同，这限制了其使用范围。 2. 如果产品的内部变化复杂，如果产品内部发生变化，则建造者也要同步修改，后期维护成本较大。
 */
public class Client {
  public static void main(String[] args) {

    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    Product construct = director.construct();
    construct.show();
  }
}
