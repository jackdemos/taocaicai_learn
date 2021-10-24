package com.taocaicai.design.pattern.behavioral.visitor;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:46:12:46
 * @package com.taocaicai.design.pattern.behavioral.visitor
 * @description 抽象访问者
 * @since: 0.0.0.1
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
