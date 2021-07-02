package com.taocaicai.design.pattern.behavioral.template.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:51:3:51
 * @description TODO
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass hook = new HookConcreteClass();
        hook.templateMethod();
    }
}
