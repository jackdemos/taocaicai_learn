package com.taocaicai.design.pattern.behavioral.interpreter.example;

import java.util.HashSet;
import java.util.Set;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:18:13:18
 * @package com.taocaicai.design.pattern.behavioral.interpreter.example
 * @description 终结符表达式类
 * @since: 0.0.0.1
 */
public class TerminalExpression implements Expression {
  private Set<String> set = new HashSet<String>();

  public TerminalExpression(String[] data) {
    for (int i = 0; i < data.length; i++) set.add(data[i]);
  }

  public boolean interpret(String info) {
    if (set.contains(info)) {
      return true;
    }
    return false;
  }
}
