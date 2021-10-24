package com.taocaicai.design.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:35:13:35
 * @package com.taocaicai.design.pattern.behavioral.mediator
 * @description 具体中介者
 * @since: 0.0.0.1
 */
public class ConcreteMediator extends Mediator {
  private List<Colleague> colleagues = new ArrayList<Colleague>();

  public void register(Colleague colleague) {
    if (!colleagues.contains(colleague)) {
      colleagues.add(colleague);
      colleague.setMedium(this);
    }
  }

  public void relay(Colleague cl) {
    for (Colleague ob : colleagues) {
      if (!ob.equals(cl)) {
        ((Colleague) ob).receive();
      }
    }
  }
}
