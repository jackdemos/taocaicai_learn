package com.taocaicai.design.pattern.behavioral.memento;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:00:13:00
 * @package com.taocaicai.design.pattern.behavioral.memento
 * @description TODO
 * @since: 0.0.0.1
 */
public class MementoPattern {
  public static void main(String[] args) {
    Originator or = new Originator();
    Caretaker cr = new Caretaker();
    or.setState("S0");
    System.out.println("初始状态:" + or.getState());
    cr.setMemento(or.createMemento()); // 保存状态
    or.setState("S1");
    System.out.println("新的状态:" + or.getState());
    or.restoreMemento(cr.getMemento()); // 恢复状态
    System.out.println("恢复状态:" + or.getState());
  }
}
