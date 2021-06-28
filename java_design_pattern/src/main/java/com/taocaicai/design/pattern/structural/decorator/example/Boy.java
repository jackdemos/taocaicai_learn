package com.taocaicai.design.pattern.structural.decorator.example;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:28:4:28
 * @description TODO
 */
public class Boy implements Person{
    @Override
    public void display() {
    System.out.println("boy 出生的初始状态,并没有穿衣服");
    }
}
