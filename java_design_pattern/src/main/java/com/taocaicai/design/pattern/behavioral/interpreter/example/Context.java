package com.taocaicai.design.pattern.behavioral.interpreter.example;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:19:13:19
 * @package com.taocaicai.design.pattern.behavioral.interpreter.example
 * @description 环境类
 * @since: 0.0.0.1
 */
public class Context {
  private String[] citys = {"韶关", "广州"};
  private String[] persons = {"老人", "妇女", "儿童"};
  private Expression cityPerson;

  public Context() {
    Expression city = new TerminalExpression(citys);
    Expression person = new TerminalExpression(persons);
    cityPerson = new AndExpression(city, person);
  }

  public void freeRide(String info) {
    boolean ok = cityPerson.interpret(info);
    if (ok) System.out.println("您是" + info + "，您本次乘车免费！");
    else System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
  }
}
