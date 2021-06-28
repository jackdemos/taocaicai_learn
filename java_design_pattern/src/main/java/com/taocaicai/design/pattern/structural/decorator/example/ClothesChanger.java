package com.taocaicai.design.pattern.structural.decorator.example;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:33:4:33
 * @description 衣服
 */
public class ClothesChanger extends Changer {

  public ClothesChanger(Person person) {
    super(person);
  }

  public void setChanger() {
    System.out.println("现在给人穿衣服和裤子");
  }

  @Override
  public void display() {
    super.display();
    setChanger();
  }
}
