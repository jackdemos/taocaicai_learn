package com.taocaicai.design.pattern.behavioral.memento;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:59:12:59
 * @package com.taocaicai.design.pattern.behavioral.memento
 * @description 备忘录
 * @since: 0.0.0.1
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
