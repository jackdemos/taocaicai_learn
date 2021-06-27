package com.taocaicai.design.pattern.principle.srp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 02:54:2:54
 * @description 辅导员
 */
public interface Instructor {
  /** 考勤统计 */
  void attendance();

  /** 创建班委组织 */
  void createCommittee();
}
