package com.taocaicai.design.pattern.behavioral.strategy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:07:4:07
 * @description 具体策略
 */
public class DivisionCalculateStrategy implements CalculateStrategy {
    @Override
    public int calc(int a, int b) {
        if (b <= 0){
            System.out.println("除数不能为小于或等于0");
            return 0;
        }
        if(a < b) {
            System.out.println("被除数不能小于除数,不能进行操作");
            return -1;
        }
        return a / b;
    }
}
