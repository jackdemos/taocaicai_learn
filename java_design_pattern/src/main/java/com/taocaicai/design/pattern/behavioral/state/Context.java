package com.taocaicai.design.pattern.behavioral.state;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 17:07:55
 * @description TODO
 */
public class Context {
    private State state;
    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }
    //设置新状态
    public void setState(State state) {
        this.state = state;
    }
    //读取状态
    public State getState() {
        return (state);
    }
    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
