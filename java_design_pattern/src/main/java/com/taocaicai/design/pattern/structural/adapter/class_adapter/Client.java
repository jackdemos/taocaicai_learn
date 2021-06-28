package com.taocaicai.design.pattern.structural.adapter.class_adapter;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:02:3:02
 * @description 类适配器模式
 *     适配器模式（Adapter）的定义如下：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 *     <p>该模式的主要优点如下。 客户端通过适配器可以透明地调用目标接口。 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
 *     将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。 在很多业务场景中符合开闭原则。
 *     <p>其缺点是： 适配器编写过程需要结合业务场景全面考虑，可能会增加系统的复杂性。 增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。
 */
public class Client {
  public static void main(String[] args) {
    System.out.println("类适配器模式测试：");
    Target adapter = new ClassAdapter();
    adapter.request();
  }
}
