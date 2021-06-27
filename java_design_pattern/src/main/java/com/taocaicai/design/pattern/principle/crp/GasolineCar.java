package com.taocaicai.design.pattern.principle.crp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:56:3:56
 * @description TODO
 */
public class GasolineCar extends Car {

    public GasolineCar(IColor color) {
        super(color);
    }

    @Override
    public void move() {
    System.out.println(color.show()+"汽油车");
    }
}
