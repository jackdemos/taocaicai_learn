package com.taocaicai;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author Oakley
 * java class 对象布局
 */
public class HelloJOL {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
