package com.taocaicai.design.pattern.principle.Liskov.v1;

/**
 * @author: Oakley
 * @created: 2021-06-24 5:38
 * @version: V1.0.0
 * @description: TODO
 */
public class BrownKiwi extends Bird {
    @Override
    public void setSpeed(double speed) {
       flySpeed=0;
    }
}
