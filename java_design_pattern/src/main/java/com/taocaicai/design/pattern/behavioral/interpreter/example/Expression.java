package com.taocaicai.design.pattern.behavioral.interpreter.example;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:18:13:18
 * @package com.taocaicai.design.pattern.behavioral.interpreter.example
 * @description 抽象表达式类
 * @since: 0.0.0.1
 * 文法规则
 *   <expression> ::= <city>的<person>
 *   <city> ::= 韶关|广州
 *   <person> ::= 老人|妇女|儿童
 *
 */
public  interface Expression {
    public boolean interpret(String info);
}
