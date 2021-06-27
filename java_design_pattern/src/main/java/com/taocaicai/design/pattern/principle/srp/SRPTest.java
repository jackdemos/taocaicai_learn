package com.taocaicai.design.pattern.principle.srp;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:07:3:07
 * @description 单一职责原则（Single Responsibility Principle，SRP）又称单一功能原则,这里的职责是指类变化的原因，
 *     单一职责原则规定一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分 （There should never be more than one reason for a
 *     classto change）。
 *     单一职责原则的核心就是控制类的粒度大小、将对象解耦、提高其内聚性。如果遵循单一职责原则将有以下优点。
 *     降低类的复杂度。一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
 *     提高类的可读性。复杂性降低，自然其可读性会提高。 提高系统的可维护性。可读性提高，那自然更容易维护了。
 *     变更引起的风险降低。变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他功能的影响。
 */
public class SRPTest {
  public static void main(String[] args) {

    Student student = new Student();
    student.life(new ChineseInstructor());
    student.study(new ChineseTearcher());
  }
}
