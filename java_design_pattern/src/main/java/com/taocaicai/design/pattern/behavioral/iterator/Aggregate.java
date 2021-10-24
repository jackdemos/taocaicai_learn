package com.taocaicai.design.pattern.behavioral.iterator;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:15:12:15
 * @package com.taocaicai.design.pattern.behavioral.iterator
 * @description 抽象聚合
 * @since: 0.0.0.1
 */
public interface Aggregate {
  void add(Object object);

  void remove(Object object);

  Iterator iterator();
}
