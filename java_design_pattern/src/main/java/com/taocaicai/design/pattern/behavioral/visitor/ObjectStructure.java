package com.taocaicai.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:50:12:50
 * @package com.taocaicai.design.pattern.behavioral.visitor
 * @description 对象结构角色
 * @since: 0.0.0.1
 */
public class ObjectStructure {
  private List<Element> list = new ArrayList<Element>();

  public void accept(Visitor visitor) {
    Iterator<Element> i = list.iterator();
    while (i.hasNext()) {
      ((Element) i.next()).accept(visitor);
    }
  }

  public void add(Element element) {
    list.add(element);
  }

  public void remove(Element element) {
    list.remove(element);
  }
}
