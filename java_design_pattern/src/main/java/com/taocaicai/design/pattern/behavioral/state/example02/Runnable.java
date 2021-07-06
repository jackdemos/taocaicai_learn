package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:24:14:24
 * @description 就绪状态
 */
public class Runnable extends ThreadState {

    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态.");
    }

    public void getCPU(ThreadContext context){
        System.out.print("获得CPU时间-->");
        if ("就绪状态".equals(stateName)) {
            context.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}
