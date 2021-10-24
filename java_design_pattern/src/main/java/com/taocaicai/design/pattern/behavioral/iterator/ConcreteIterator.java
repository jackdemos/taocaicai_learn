package com.taocaicai.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:24:12:24
 * @package com.taocaicai.design.pattern.behavioral.iterator
 * @description 具体迭代器
 * @since: 0.0.0.1
 */
public class ConcreteIterator implements Iterator {
  List<Object> list = null;
  int index = -1;

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  @Override
  public Object first() {
    index = 0;
    Object o = list.get(0);

    return o;
  }

  @Override
  public Object last() {
    index = list.size() - 1;
    Object o = list.get(index);
    return o;
  }

  @Override
  public Object next() {
    Object o = null;
    if (this.hasNext()) {
      o = list.get(++index);
    }
    return o;
  }

  @Override
  public boolean hasNext() {
    if (index < list.size() - 1) {
      return true;
    } else {
      return false;
    }
  }
}
