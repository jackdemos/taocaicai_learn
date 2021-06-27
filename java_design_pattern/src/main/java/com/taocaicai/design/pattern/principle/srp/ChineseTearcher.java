package com.taocaicai.design.pattern.principle.srp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:04:3:04
 * @description TODO
 */
public class ChineseTearcher implements Tearcher{
    @Override
    public void career() {
    System.out.println("中文老师进行专业辅导");
    }

    @Override
    public void scientific() {
    System.out.println("中文老师进行中文科研辅导");

    }

    @Override
    public void summary() {
        System.out.println("中文老师进行中文研究总结");
    }
}
