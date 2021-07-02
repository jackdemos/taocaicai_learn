package com.taocaicai.design.pattern.behavioral.strategy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:09:4:09
 * @description 环境（Context）类：持有一个策略类的引用，最终给客户端调用
 */
public class Context {
    CalculateStrategy strategy;

    public CalculateStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public void calc(int a, int b) {
        System.out.println("当前使用的计算模式为:"+strategy.getClass().getSimpleName());
        int result = strategy.calc(a, b);
        System.out.println("结果:" + result);
    }
}
