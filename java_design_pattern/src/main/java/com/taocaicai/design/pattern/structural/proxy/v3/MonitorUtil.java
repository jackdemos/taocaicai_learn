package com.taocaicai.design.pattern.structural.proxy.v3;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 08:49:8:49
 * @description TODO
 */
public class MonitorUtil {
  private static ThreadLocal<Long> tl = new ThreadLocal<>();

  public static void start() {
    tl.set(System.currentTimeMillis());
  }

  /** 结束时打印耗时 */
  public static void finish(String methodName) {
    long finishTime = System.currentTimeMillis();
    System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
  }
}
