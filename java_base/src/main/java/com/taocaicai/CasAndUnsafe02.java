package com.taocaicai;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author oakley
 */
public class CasAndUnsafe02 {
    private static AtomicInteger m = new AtomicInteger(0);

    /**
     * ABA问题？ -加版本号
     * CAS修改值时候  的原子性问题
     * */
    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        Object o = new Object();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "=======" + m);
                for (int j = 0; j < 100000; j++) {
                    m.incrementAndGet();
                }
                latch.countDown();

            });
        }

        Arrays.stream(threads).forEach((t) -> t.start());
        latch.await();
        System.out.println(m);
    }
}
