package com.taocaicai.design.pattern.behavioral.strategy;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:10:4:10
 * @description 策略模式的主要角色如下。
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        CalculateStrategy s = new AddCalculateStrategy();
        context.setStrategy(s);
        context.calc(22, 22);
        System.out.println("-----------------");
        s = new MultiplicationCalculateStrategy();
        context.setStrategy(s);
        context.calc(22,3);

        System.out.println("-----------------");
        s = new DivisionCalculateStrategy();
        context.setStrategy(s);
        context.calc(2,-1);
    }
}
