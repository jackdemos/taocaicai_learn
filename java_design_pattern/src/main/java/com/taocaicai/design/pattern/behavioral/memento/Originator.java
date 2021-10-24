package com.taocaicai.design.pattern.behavioral.memento;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:59:12:59
 * @package com.taocaicai.design.pattern.behavioral.memento
 * @description TODO
 * @since: 0.0.0.1
 */
public class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
