package com.taocaicai.design.pattern.behavioral.command;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:52:4:52
 * @description 执行者(具体任务执行者)
 */
public class Receiver {
    void action() {
        System.out.println("接收到命令，开始执行 action()方法被调用");
    }
}
