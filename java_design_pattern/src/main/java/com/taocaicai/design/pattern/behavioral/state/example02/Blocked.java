package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:27:14:27
 * @description 阻塞状态
 */
public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }
    public void resume(ThreadContext context) {
        System.out.print("调用resume()方法-->");
        if ("阻塞状态".equals(stateName)) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
