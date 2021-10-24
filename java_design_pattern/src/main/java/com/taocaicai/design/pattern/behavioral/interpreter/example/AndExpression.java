package com.taocaicai.design.pattern.behavioral.interpreter.example;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:19:13:19
 * @package com.taocaicai.design.pattern.behavioral.interpreter.example
 * @description TODO
 * @since: 0.0.0.1
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;
    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
