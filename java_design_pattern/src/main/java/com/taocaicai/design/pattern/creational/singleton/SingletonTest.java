package com.taocaicai.design.pattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 04:41:4:41
 * @description TODO
 */
public class SingletonTest {
  public static void main(String[] args) {
    List<Thread> threadList = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      threadList.add(
          new Thread(
              () -> {
                System.out.println(
                    Thread.currentThread().getName() + "---" + Singleton06.getInstance());
              },
              "Thread-00" + i));
    }
    threadList.forEach(t -> t.start());
  }
}
