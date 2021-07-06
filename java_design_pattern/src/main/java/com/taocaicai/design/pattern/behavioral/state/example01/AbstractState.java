package com.taocaicai.design.pattern.behavioral.state.example01;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 13:48:13:48
 * @description TODO
 */
public abstract class AbstractState {
  protected ScoreContext context;
  protected String stateName; // 状态名
  protected int score;

  abstract void checkState();

  void addScore(int score) {
    this.score += score;
    System.out.print("加上：" + score + "分，\t当前分数：" + this.score);
    checkState();
    System.out.println("分，\t当前状态：" + context.getState().stateName);
  }
}
