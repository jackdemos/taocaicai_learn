package com.taocaicai.design.pattern.behavioral.mediator;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:36:13:36
 * @package com.taocaicai.design.pattern.behavioral.mediator
 * @description 具体同事类
 * @since: 0.0.0.1
 */
public class ConcreteColleague2 extends Colleague {
  public void receive() {
    System.out.println("具体同事类2收到请求。");
  }

  public void send() {
    System.out.println("具体同事类2发出请求。");
    mediator.relay(this); // 请中介者转发
  }
}
