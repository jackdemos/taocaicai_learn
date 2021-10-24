package com.taocaicai.design.pattern.behavioral.interpreter.example;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:17:13:17
 * @package com.taocaicai.design.pattern.behavioral.interpreter.example
 * @description TODO
 * @since: 0.0.0.1
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
