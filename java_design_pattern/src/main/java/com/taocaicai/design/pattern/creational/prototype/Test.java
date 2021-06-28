package com.taocaicai.design.pattern.creational.prototype;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 05:36:5:36
 * @description
 *     原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 *     在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 *     <p>Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良
 *     可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，
 *     以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
 */
public class Test {
  public static void main(String[] args) throws CloneNotSupportedException {
    ObjectProtoType o1 = new ObjectProtoType();
    ObjectProtoType o2 = (ObjectProtoType) o1.clone();
    System.out.println("o1==o2 : " + (o1 == o2));
  }
}
