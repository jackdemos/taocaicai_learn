package com.taocaicai.design.pattern.structural.composite.v1;

import java.util.ArrayList;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:22:6:22
 * @description 树枝组件
 */
public class Composite implements Component {
  private ArrayList<Component> children = new ArrayList<Component>();

  @Override
  public void add(Component c) {
    children.add(c);
  }

  @Override
  public void remove(Component c) {
    children.remove(c);
  }

  @Override
  public Component getChild(int i) {
    return children.get(i);
  }

  @Override
  public void operation() {
    for (Object obj : children) {
      ((Component) obj).operation();
    }
  }
}
