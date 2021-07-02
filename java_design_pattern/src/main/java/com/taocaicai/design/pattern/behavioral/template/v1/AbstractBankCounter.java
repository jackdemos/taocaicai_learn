package com.taocaicai.design.pattern.behavioral.template.v1;

import java.util.Random;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:11:3:11
 * @description 银行柜台
 */
public abstract class AbstractBankCounter {
    /**
     * 取号
     */
    int getNo() {
        return new Random().nextInt(1000);
    }

    void evaluate() {
        System.out.println("客户评价成功");
    }

    /**
     * @param cutomer
     */
    public void template(Customer cutomer) {
        int serviceNO = getNo();
        cutomer.setServiceNO(serviceNO);
        System.out.println(serviceNO + "号\t" + cutomer.getName() + "客户业务已开始办理");
        process(cutomer);
        System.out.println(serviceNO + "号\t" + cutomer.getName() + "客户业务已办理完成");
        evaluate();

    }

   public abstract void process(Customer customer);

}
