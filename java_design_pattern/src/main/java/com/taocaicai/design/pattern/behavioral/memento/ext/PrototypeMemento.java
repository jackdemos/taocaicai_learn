package com.taocaicai.design.pattern.behavioral.memento.ext;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:05:13:05
 * @package com.taocaicai.design.pattern.behavioral.memento.ext
 * @description 备忘录模式如何同原型模式混合使用
 * @since: 0.0.0.1
 */
public class PrototypeMemento {
    public static void main(String[] args) {
        OriginatorPrototype or = new OriginatorPrototype();
        PrototypeCaretaker cr = new PrototypeCaretaker();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:" + or.getState());
    }
}
