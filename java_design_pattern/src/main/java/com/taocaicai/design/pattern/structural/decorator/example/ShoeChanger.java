package com.taocaicai.design.pattern.structural.decorator.example;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:33:4:33
 * @description TODO
 */
public class ShoeChanger extends Changer {
  public ShoeChanger(Person person) {
    super(person);
  }

  public void setChanger() {
    System.out.println("现在给人穿一双鞋子");
  }

  @Override
  public void display() {
    super.display();
    setChanger();
  }
}
