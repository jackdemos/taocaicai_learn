package com.taocaicai.design.pattern.principle.Lod;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:32:3:32
 * @description 迪米特法则（Law of Demeter，LoD）又叫作最少知识原则（Least Knowledge Principle，LKP)
 *     迪米特法则的定义是：只与你的直接朋友交谈，不跟“陌生人”说话（Talk only to your immediate friends and not to
 *     strangers）。其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用， 可以通过第三方转发该调用。 其目的是降低类之间的耦合度，提高模块的相对独立性。
 *     迪米特法则中的“朋友”是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等， 这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法。
 */
public class LodTest {
  public static void main(String[] args) {
    //
    Agent agent = new Agent();
    agent.setStar(new Star("林心如"));
    agent.setFans(new Fans("粉丝韩丞"));
    agent.setCompany(new Company("中国传媒有限公司"));
    agent.meeting();
    agent.business();
  }
}
