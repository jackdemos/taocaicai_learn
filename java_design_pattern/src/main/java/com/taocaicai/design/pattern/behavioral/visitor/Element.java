package com.taocaicai.design.pattern.behavioral.visitor;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:48:12:48
 * @package com.taocaicai.design.pattern.behavioral.visitor
 * @description 抽象访问元素
 * @since: 0.0.0.1
 */
public interface Element {
    void accept(Visitor visitor);
}
