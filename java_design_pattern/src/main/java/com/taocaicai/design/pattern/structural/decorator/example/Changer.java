package com.taocaicai.design.pattern.structural.decorator.example;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:30:4:30
 * @description 改变
 */
public class Changer implements Person {
  Person person;

  public Changer(Person person) {
    this.person = person;
  }

  @Override
  public void display() {
    person.display();
  }
}
