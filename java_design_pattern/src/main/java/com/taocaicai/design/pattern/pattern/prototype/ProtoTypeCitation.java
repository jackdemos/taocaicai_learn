package com.taocaicai.design.pattern.pattern.prototype;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 05:57:5:57
 * @description TODO
 */
public class ProtoTypeCitation {
  public static void main(String[] args) throws CloneNotSupportedException {
    Citation obj1 = new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
    obj1.display();
    System.out.println("开始克隆");
    Citation o2 = (Citation) obj1.clone();
    o2.setName("李晓晓");
    o2.display();
  }
}
