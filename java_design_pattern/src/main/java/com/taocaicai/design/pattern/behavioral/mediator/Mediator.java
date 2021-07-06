package com.taocaicai.design.pattern.behavioral.mediator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 15:56:15:56
 * @description TODO
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
