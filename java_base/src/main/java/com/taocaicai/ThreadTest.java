package com.taocaicai;


/**
 * @author oakley
 */
public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            new Thread(() -> {
                synchronized (ThreadTest.class) {
                    try {
                        System.out.println("Thread name:\t" + Thread.currentThread().getName() + "获取到锁");
                        System.out.println("当前厕所使用人是" + Thread.currentThread().getName());
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "thread-" + i).start();
        }
    }
}
