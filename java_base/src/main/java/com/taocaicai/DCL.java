package com.taocaicai;

import java.util.Arrays;

/**
 * Double Check Lock (DCL)
 * volatile 解决以下问题：
 * 1. 内存可见性
 * 2. 禁止指令乱序
 * JSR内存屏障?
 *  LoadLoad
 *  StoreStore
 *  LoadStore
 *  StoreLoad
 *       __asm__ volatile ("lock; addl $0,0(%%rsp)" : : : "cc", "memory");
 */
public class DCL {
    private static volatile DCL instance;

    private DCL() {

    }

    /**
     * Double Check Lock
     *
     * @return
     */
    public static DCL getInstance() {
        if (instance == null) {
            //双重检查
            synchronized (DCL.class) {
                if (null == instance) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(DCL.getInstance());
            });
        }

        Arrays.stream(threads).forEach((t) -> t.start());
    }

}
