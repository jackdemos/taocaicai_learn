package com.taocaicai.design.pattern.behavioral.chain;

public abstract class Handler {
    Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 请假天数
     * @param day
     */
    public abstract void  HandlerRequest(int day);
}
