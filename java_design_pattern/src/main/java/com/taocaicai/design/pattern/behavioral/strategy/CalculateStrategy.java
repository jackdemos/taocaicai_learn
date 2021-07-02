package com.taocaicai.design.pattern.behavioral.strategy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:02:4:02
 * @description 抽象策略
 */
public interface CalculateStrategy {
    /**
     * 策略方法
     */
    public int calc(int a, int b);
}
