package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:26:14:26
 * @description 运行状态
 */
public class Running extends ThreadState {

    public Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }
    public void suspend(ThreadContext context) {
        System.out.print("调用suspend()方法-->");
        if ("运行状态".equals(stateName)) {
            context.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }
    public void stop(ThreadContext context) {
        System.out.print("调用stop()方法-->");
        if ("运行状态".equals(stateName)) {
            context.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}
