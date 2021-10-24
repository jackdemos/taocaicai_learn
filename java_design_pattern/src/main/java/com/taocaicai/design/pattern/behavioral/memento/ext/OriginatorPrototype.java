package com.taocaicai.design.pattern.behavioral.memento.ext;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:06:13:06
 * @package com.taocaicai.design.pattern.behavioral.memento.ext
 * @description 发起人原型
 * @since: 0.0.0.1
 */
public class OriginatorPrototype implements Cloneable {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public OriginatorPrototype createMemento() {
    return this.clone();
  }

  public void restoreMemento(OriginatorPrototype opt) {
    this.setState(opt.getState());
  }

  public OriginatorPrototype clone() {
    try {
      return (OriginatorPrototype) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
}
