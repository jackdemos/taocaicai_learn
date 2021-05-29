package com.taocaicai;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 * @author oakley
 */
public class CasAndUnsafe {
    private static int m = 0;

    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        Object o = new Object();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"======="+m);
                synchronized (o) {
                    for (int j = 0; j < 100000; j++) {
                        m++;
                    }
                    latch.countDown();
                }
            });
        }

        Arrays.stream(threads).forEach((t) -> t.start());
        latch.await();
        System.out.println(m);
    }
}
