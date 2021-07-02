package com.taocaicai.design.pattern.behavioral.template.v2;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:47:3:47
 * @description 含钩子方法的抽象类
 * 模板方法模式中，基本方法包含：抽象方法、具体方法和钩子方法，正确使用“钩子方法”可以使得子类控制父类的行为
 */
abstract class HookAbstractClass {
    /**
     * 模板方法
     */
    public void templateMethod() {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 钩子方法1
     */
    public void HookMethod1() {
    }

    /**
     * 钩子方法2
     *
     * @return
     */
    public boolean HookMethod2() {
        return true;
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();

}
