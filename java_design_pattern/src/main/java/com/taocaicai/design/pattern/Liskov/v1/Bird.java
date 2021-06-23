package com.taocaicai.design.pattern.Liskov.v1;

/**
 * @author: Oakley
 * @created: 2021-06-24 5:37
 * @version: V1.0.0
 * @description: TODO
 */
public class Bird {
    double flySpeed;
    public void setSpeed(double speed) {
        flySpeed = speed;
    }
    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
