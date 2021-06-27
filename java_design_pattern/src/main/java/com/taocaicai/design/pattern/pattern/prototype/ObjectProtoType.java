package com.taocaicai.design.pattern.pattern.prototype;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 05:34:5:34
 * @description 原型模式
 */
public class ObjectProtoType implements Cloneable {
  ObjectProtoType() {
    System.out.println("具体原型创建成功！");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    System.out.println("具体原型复制成功");
    return (ObjectProtoType) super.clone();
  }
}
