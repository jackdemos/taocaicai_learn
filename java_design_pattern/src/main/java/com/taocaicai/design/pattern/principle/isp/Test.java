package com.taocaicai.design.pattern.principle.isp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:14:3:14
 * @description 接口隔离原则（Interface Segregation
 *     Principle，ISP）要求程序员尽量将臃肿庞大的接口拆分成更小的和更具体的接口，让接口中只包含客户感兴趣的方法。
 *     “接口隔离原则”的定义是：客户端不应该被迫依赖于它不使用的方法（Clients should not be forced to depend on methods they do not
 *     use）。该原则还有另外一个定义：一个类对另一个类的依赖应该建立在最小的接口上（The dependency of one class to another one should
 *     depend on the smallest possible interface）。 要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口供所有依赖它的类去调用。
 */
public class Test {
  public static void main(String[] args) {
    /*人会吃  说话  听声音*/
    Person person = new Person();
    person.eat();
    person.listen();
    person.say();
    System.out.println("=================================");

    /*风筝只会飞*/
    IFly kite = new Kite();
    kite.fly();

    System.out.println("=================================");
    /*鸟会吃 、叫、听声音 飞*/
    Bird bird = new Bird();
    bird.eat();
    bird.fly();
    bird.listen();
    bird.say();
  }
}
