package com.taocaicai.design.pattern.principle.srp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 02:53:2:53
 * @description TODO
 */
public class Student {
  public void life(Instructor instructor) {
    instructor.attendance();
    instructor.createCommittee();
  }

  public void study(Tearcher tearcher) {
    tearcher.career();
    tearcher.scientific();
    tearcher.summary();
  }
}
