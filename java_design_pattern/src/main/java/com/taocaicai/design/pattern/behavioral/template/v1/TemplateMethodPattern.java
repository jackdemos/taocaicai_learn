package com.taocaicai.design.pattern.behavioral.template.v1;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:22:3:22
 * @description 模版方法模式(银行办理业务)
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
       Customer  customer =  new Customer("0001", "张三", 100000, "存钱");
        AbstractBankCounter business = new FirstBankCounter();
        business.template(customer);
    }
}
