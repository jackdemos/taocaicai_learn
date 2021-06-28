package com.taocaicai.design.pattern.structural.composite.v3;

import java.util.ArrayList;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:32:6:32
 * @description 购物袋
 */
public class Bags implements Articles {
  private String name;
  /** 袋子数量 */
  private ArrayList<Articles> bags = new ArrayList<Articles>();

  public Bags(String name) {
    this.name = name;
  }

  public void add(Articles articles) {
    bags.add(articles);
  }

  public void remove(Articles articles) {
    bags.remove(articles);
  }

  public Articles getChild(int i) {
    return bags.get(i);
  }

  @Override
  public float calculation() {
    float sum = 0;
    for (Articles articles : bags) {
      sum += articles.calculation();
    }
    return sum;
  }

  @Override
  public void show() {
    for (Object obj : bags) {
      ((Articles) obj).show();
    }
  }
}
