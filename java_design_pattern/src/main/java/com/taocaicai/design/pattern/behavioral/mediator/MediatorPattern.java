package com.taocaicai.design.pattern.behavioral.mediator;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:37:13:37
 * @package com.taocaicai.design.pattern.behavioral.mediator
 * @description
 * 1、抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。 具体中介者（Concrete
 * 2、Mediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 3、抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 4、具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * @since: 0.0.0.1
 */
public class MediatorPattern {
  public static void main(String[] args) {
    Mediator md = new ConcreteMediator();
    Colleague c1, c2;
    c1 = new ConcreteColleague1();
    c2 = new ConcreteColleague2();
    md.register(c1);
    md.register(c2);
    c1.send();
    System.out.println("-------------");
    c2.send();
  }
}
