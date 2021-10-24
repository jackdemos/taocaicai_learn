package com.taocaicai.design.pattern.behavioral.iterator;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:21:12:21
 * @package com.taocaicai.design.pattern.behavioral.iterator
 * @description 抽象迭代器
 * @since: 0.0.0.1
 */
public interface Iterator {
    Object first();
    Object last();
    Object next();
    boolean hasNext();
}
