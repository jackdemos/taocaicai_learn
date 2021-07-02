package com.taocaicai.design.pattern.behavioral.command;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:51:4:51
 * @description 是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 */
public class ConcreteCommandA implements Command {
    Receiver receiver;

    public ConcreteCommandA() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
