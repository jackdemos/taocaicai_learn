package com.taocaicai.design.pattern.behavioral.command;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:52:4:52
 * @description 调用者(命令发送者)
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
