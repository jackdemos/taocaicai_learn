package com.taocaicai.design.pattern.structural.bridge;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 03:41:3:41
 * @description 汽车管理
 */
public class CarManager {
  private static Color color;
  private static Car car;

  public static void main(String[] args) throws Exception {
    String aPackage = CarManager.class.getPackage().toString().replaceAll("package", "").trim();
    String colorName = aPackage + "." + args[0];
    String carName = aPackage + "." + args[1];

    Class<?> colorClass = Class.forName(colorName);
    color = (Color) colorClass.newInstance();

    Class<?> carClass = Class.forName(carName);
    car = (Car) carClass.newInstance();
    car.setColor(color);

    System.out.println(car.getName());
  }
}
