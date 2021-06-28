package com.taocaicai.design.pattern.creational.bulider;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 07:35:7:35
 * @description TODO
 */
public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPartA() {
    product.setPartA("第二个建造者 A");
    }

    @Override
    public void buildPartB() {
    product.setPartB("第二个建造者 B");

    }

    @Override
    public void buildPartC() {
    product.setPartC("第二个建造者 C");

    }
}
