package com.taocaicai.design.pattern.behavioral.memento;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 13:00:13:00
 * @package com.taocaicai.design.pattern.behavioral.memento
 * @description TODO
 * @since: 0.0.0.1
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m) {
        memento = m;
    }
    public Memento getMemento() {
        return memento;
    }
}
