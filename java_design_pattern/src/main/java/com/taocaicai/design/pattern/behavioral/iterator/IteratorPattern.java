package com.taocaicai.design.pattern.behavioral.iterator;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:15:12:15
 * @package com.taocaicai.design.pattern.behavioral.iterator
 * @description TODO
 * @since: 0.0.0.1
 */
public class IteratorPattern {
  public static void main(String[] args) {
    Aggregate ag = new ConcreteAggregate();
    ag.add("成都");
    ag.add("上海");
    ag.add("南京");
    ag.add("长沙");
    System.out.print("聚合的内容有：");
    Iterator iterator = ag.iterator();
    while (iterator.hasNext()) {
      Object ob = iterator.next();
      System.out.print(ob.toString() + "\t");
    }

    Object ob = iterator.first();
    System.out.println("\nFirst：" + ob.toString());

    Object oa = iterator.last();
    System.out.println("\nlast：" + oa.toString());
  }
}
