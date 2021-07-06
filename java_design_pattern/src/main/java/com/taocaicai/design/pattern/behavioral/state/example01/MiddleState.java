package com.taocaicai.design.pattern.behavioral.state.example01;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 13:54:13:54
 * @description TODO
 */
public class MiddleState extends AbstractState {

  MiddleState(AbstractState state) {
    this.context = state.context;
    stateName = "中等";
    score = state.score;
  }

  @Override
  void checkState() {
    if (score < 60) {
      this.context.setState(new LowState(this));
    } else if (score >= 90) {
      this.context.setState(new HightState(this));
    }
  }
}
