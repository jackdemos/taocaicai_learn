package com.taocaicai.design.pattern.behavioral.state.example01;

import com.taocaicai.design.pattern.behavioral.state.State;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 13:50:13:50
 * @description TODO
 */
public class ScoreContext {
  private AbstractState state;

  public ScoreContext() {
    this.state = new LowState(this);
  }

  public void setState(AbstractState state) {
    this.state = state;
  }

  public AbstractState getState() {
    return state;
  }

  public void add(int score) {
    state.addScore(score);
  }
}
