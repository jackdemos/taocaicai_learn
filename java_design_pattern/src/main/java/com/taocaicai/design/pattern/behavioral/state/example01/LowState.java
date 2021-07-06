package com.taocaicai.design.pattern.behavioral.state.example01;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 13:53:13:53
 * @description TODO
 */
public class LowState extends AbstractState {
  public LowState(ScoreContext context) {
    this.context = context;
    stateName = "差";
    score = 0;
  }

  public LowState(AbstractState state) {
    this.context = state.context;
    stateName = "不及格";
    score = state.score;
  }

  @Override
  void checkState() {
    if (score > 90) {
      this.context.setState(new HightState(this));
    } else if (score > 60) {
      this.context.setState(new MiddleState(this));
    }
  }
}
