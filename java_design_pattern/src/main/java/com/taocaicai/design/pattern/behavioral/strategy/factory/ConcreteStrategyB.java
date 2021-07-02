package com.taocaicai.design.pattern.behavioral.strategy.factory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:29:4:29
 * @description TODO
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("调用基础的策略B");
    }
}
