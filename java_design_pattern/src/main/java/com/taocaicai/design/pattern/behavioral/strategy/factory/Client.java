package com.taocaicai.design.pattern.behavioral.strategy.factory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:34:4:34
 * @description TODO
 */
public class Client {
    static StrategyFactory strategyFactory;

    /*临时做一个初始化工作*/
    static {
        strategyFactory = new StrategyFactory();
        strategyFactory.put("strategyA", new ConcreteStrategyA());
        strategyFactory.put("strategyB", new ConcreteStrategyB());
    }

    public static void main(String[] args) {
        Strategy strategy = strategyFactory.get("strategyA");
        strategy.strategyMethod();
        System.out.println("============================");
        strategy = strategyFactory.get("strategyB");
        strategy.strategyMethod();
    }
}
