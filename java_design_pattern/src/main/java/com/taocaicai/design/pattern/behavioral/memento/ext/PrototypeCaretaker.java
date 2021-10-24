package com.taocaicai.design.pattern.behavioral.memento.ext;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:06:13:06
 * @package com.taocaicai.design.pattern.behavioral.memento.ext
 * @description 原型管理者
 * @since: 0.0.0.1
 */
public class PrototypeCaretaker {
    private OriginatorPrototype opt;
    public void setMemento(OriginatorPrototype opt) {
        this.opt = opt;
    }
    public OriginatorPrototype getMemento() {
        return opt;
    }
}
