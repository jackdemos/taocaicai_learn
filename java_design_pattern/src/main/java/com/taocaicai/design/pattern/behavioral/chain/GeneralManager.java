package com.taocaicai.design.pattern.behavioral.chain;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-05 16:50:09
 * @description 总经理
 */
public class GeneralManager extends Handler {
    @Override
    public void HandlerRequest(int day) {
        if (day <= 7) {
            System.out.println("您的请假被 总经理 批准了");
        } else {
            if (getNext() != null) {
                getNext().HandlerRequest(day);
            } else {
                System.out.println("当前权限不构无法处理！");
            }
        }
    }
}
