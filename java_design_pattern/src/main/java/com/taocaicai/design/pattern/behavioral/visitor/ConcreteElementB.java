package com.taocaicai.design.pattern.behavioral.visitor;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:48:12:48
 * @package com.taocaicai.design.pattern.behavioral.visitor
 * @description 具体元素
 * @since: 0.0.0.1
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "具体元素B的操作。";
    }
}
