package com.taocaicai.design.pattern.behavioral.state.example02;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-06 14:21:14:21
 * @description 模拟线程上下文
 */
public class ThreadContext {
  private ThreadState state;

  public ThreadContext() {
    state = new New();
  }

  public void setState(ThreadState state) {
    this.state = state;
  }

  public ThreadState getState() {
    return state;
  }

  public void start() {
    ((New) state).start(this);
  }

  public void getCPU() {
    ((Runnable) state).getCPU(this);
  }

  public void suspend() {
    ((Running) state).suspend(this);
  }

  public void stop() {
    ((Running) state).stop(this);
  }

  public void resume() {
    ((Blocked) state).resume(this);
  }
}
