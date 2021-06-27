package com.taocaicai.design.pattern.principle.crp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:57:3:57
 * @description TODO
 */
public class ElectricCar extends Car {

    public ElectricCar(IColor color) {
        super(color);
    }

    @Override
    public void move() {
    System.out.println(color.show()+"电动汽车");
    }
}
