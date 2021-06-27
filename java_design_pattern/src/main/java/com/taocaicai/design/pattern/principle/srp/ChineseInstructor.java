package com.taocaicai.design.pattern.principle.srp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:06:3:06
 * @description TODO
 */
public class ChineseInstructor implements Instructor{
    @Override
    public void attendance() {
    System.out.println("班主任是生活老师，进行考勤统计");
    }

    @Override
    public void createCommittee() {
    System.out.println("班主任是生活老师，组织班会");

    }
}
