package com.taocaicai.design.pattern.behavioral.template.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:49:3:49
 * @description TODO
 */
public class HookConcreteClass extends HookAbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean HookMethod2() {
        return false;
    }
}
