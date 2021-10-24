package com.taocaicai.design.pattern.behavioral.interpreter;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:09:13:09
 * @package com.taocaicai.design.pattern.behavioral.interpreter
 * @description TODO
 * @since: 0.0.0.1
 */
public interface  AbstractExpression {
    /**
     * 解释方法
     * @param info
     */

     void interpret(String info);
}
