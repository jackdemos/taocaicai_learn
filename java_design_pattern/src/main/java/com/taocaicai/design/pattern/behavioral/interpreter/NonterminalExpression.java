package com.taocaicai.design.pattern.behavioral.interpreter;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:10:13:10
 * @package com.taocaicai.design.pattern.behavioral.interpreter
 * @description 非终结符表达式类
 * @since: 0.0.0.1
 */
public class NonterminalExpression implements AbstractExpression {
  private AbstractExpression exp1;
  private AbstractExpression exp2;

  @Override
  public void interpret(String info) {
    // 非对终结符表达式的处理
  }
}
