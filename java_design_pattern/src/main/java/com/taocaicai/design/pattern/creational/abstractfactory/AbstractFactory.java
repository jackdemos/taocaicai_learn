package com.taocaicai.design.pattern.creational.abstractfactory;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:07:7:07
 * @description 抽象工厂方法
 */
public interface AbstractFactory {
    /**
     * 生产电视机
     * @return
     */
    TV createTV();
    /**
     * 生产电冰箱
     * */
    Refrigerator createRefrigerator();
}
