package com.taocaicai.design.pattern.behavioral.template.v1;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:28:3:28
 * @description 柜台一
 */
public class FirstBankCounter extends AbstractBankCounter {
    @Override
    public void process(Customer customer) {
        System.out.println("欢迎您:" + customer.getName());
        System.out.println("业务类型:" + customer.getType());
        System.out.println("金额:" + customer.getMoney());
    }
}
