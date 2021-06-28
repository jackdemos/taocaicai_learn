package com.taocaicai.design.pattern.structural.bridge;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:37:3:37
 * @description 蓝色
 */
public class Blue implements Color {
    @Override
    public String getColor() {
        return this.getClass().getSimpleName();
    }
}
