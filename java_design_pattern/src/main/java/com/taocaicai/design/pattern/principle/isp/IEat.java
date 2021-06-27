package com.taocaicai.design.pattern.principle.isp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:18:3:18
 * @description TODO
 */
public interface IEat {
    /**
     * 吃
     */
    void eat();

    IEat getInstance();
}
