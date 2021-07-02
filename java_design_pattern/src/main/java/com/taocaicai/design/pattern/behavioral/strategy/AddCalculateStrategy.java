package com.taocaicai.design.pattern.behavioral.strategy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:05:4:05
 * @description 具体策略
 */
public class AddCalculateStrategy implements CalculateStrategy {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
