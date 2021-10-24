package com.taocaicai.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:19:12:19
 * @package com.taocaicai.design.pattern.behavioral.iterator
 * @description 具体聚合
 * @since: 0.0.0.1
 */
public class ConcreteAggregate implements Aggregate {
  List<Object> list = new ArrayList<>();

  @Override
  public void add(Object object) {
    list.add(object);
  }

  @Override
  public void remove(Object object) {
    this.remove(object);
  }

  @Override
  public Iterator iterator() {

    return new ConcreteIterator(list);
  }
}
