package com.taocaicai.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * 享元（Flyweight）模式的定义： 运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 *
 * <p>享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 *
 * <p>其主要缺点是：
 * 1. 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 2. 读取享元模式的外部状态会使得运行时间稍微变长。
 * <p>
 * 享元模式的定义提出了两个要求，细粒度和共享对象。
 *  因为要求细粒度，所以不可避免地会使对象数量多且性质相近，此时我们就将这些对象的信息分为两个部分：内部状态和外部状态。
 * - 内部状态指对象共享出来的信息，存储在享元信息内部，并且不回随环境的改变而改变；
 * - 外部状态指对象得以依赖的一个标记，随环境的改变而改变，不可共享。
 * </p>
 */
public class FlyweightPattern {
  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight f01 = factory.getFlyweight("a");
    Flyweight f02 = factory.getFlyweight("a");
    Flyweight f03 = factory.getFlyweight("a");
    Flyweight f11 = factory.getFlyweight("b");
    Flyweight f12 = factory.getFlyweight("b");
    f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
    f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
    f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
    f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
    f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
  }
}

/*
 * 非享元角色
 */
class UnsharedConcreteFlyweight {
  private String info;

  UnsharedConcreteFlyweight(String info) {
    this.info = info;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}

// 抽象享元角色
interface Flyweight {
  public void operation(UnsharedConcreteFlyweight state);
}

// 具体享元角色
class ConcreteFlyweight implements Flyweight {
  private String key;

  ConcreteFlyweight(String key) {
    this.key = key;
    System.out.println("具体享元" + key + "被创建！");
  }

  @Override
  public void operation(UnsharedConcreteFlyweight outState) {
    System.out.print("具体享元" + key + "被调用，");
    System.out.println("非享元信息是:" + outState.getInfo());
  }
}

// 享元工厂角色
class FlyweightFactory {
  private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

  public Flyweight getFlyweight(String key) {
    Flyweight flyweight = (Flyweight) flyweights.get(key);
    if (flyweight != null) {
      System.out.println("具体享元" + key + "已经存在，被成功获取！");
    } else {
      flyweight = new ConcreteFlyweight(key);
      flyweights.put(key, flyweight);
    }
    return flyweight;
  }
}
