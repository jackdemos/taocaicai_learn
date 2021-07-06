package com.taocaicai.design.pattern.behavioral.state.example02;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:22:14:22
 * @description 新建状态
 */
public class New extends ThreadState {
   public New(){
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    public void start(ThreadContext context){
        System.out.print("调用start()方法-->");
        if ("新建状态".equals(stateName)) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
