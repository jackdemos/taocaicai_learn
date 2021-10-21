package com.taocaicai;

import org.openjdk.jol.info.ClassLayout;

/** @author Oakley java class 对象布局 */
public class HelloJOL {

  public static void main(String[] args) {
    Object o = new Object();
    /*
     *未加锁对象头
     * (object header)       01 00 00 00 (00000001 00000000 00000000 00000000) (1)
     */
    System.out.println(ClassLayout.parseInstance(o).toPrintable());
    synchronized (o) {
      /*
       * 加锁对象头
       * (object header)     b8 f2 8f 0c (10111000 11110010 10001111 00001100) (210760376)
       * */
      System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
    System.out.println(ClassLayout.parseInstance(o).toPrintable());
  }
}
