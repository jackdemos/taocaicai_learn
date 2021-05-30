package com.taocaicai.jvm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @autor Oakley
 * @date 2021-05-31 04:57:54
 * jps
 * jmap
 * top
 * jstack
 * jstat
 *
 * jmap -dump:format=b,file=20210231.hprof 10860
 *
 * 在线引流工具Tcpcopy原理
 */
public class FullGC_Problem01 {
  private static class CardInfo {
    BigDecimal price = new BigDecimal(0.0);
    String name = "张三";
    int age = 11;
    Date birthday = new Date();

    public void m() {}
  }

  public static ScheduledThreadPoolExecutor executor =
      new ScheduledThreadPoolExecutor(50, new ThreadPoolExecutor.DiscardPolicy());

  public static void main(String[] args) throws InterruptedException {
    executor.setMaximumPoolSize(50);
    for (; ; ) {
      modelFit();
      Thread.sleep(100);
    }
  }

  public static void modelFit() {
    List<CardInfo> taskList = getAllCardInfo();
    taskList.forEach(
        cardInfo -> {
          executor.scheduleWithFixedDelay(
              () -> {
                cardInfo.m();
              },
              2,
              3,
              TimeUnit.SECONDS);
        });
  }

  private static List<CardInfo> getAllCardInfo() {
    List<CardInfo> taskList = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      CardInfo c = new CardInfo();
      taskList.add(c);
    }
    return taskList;
  }
}
