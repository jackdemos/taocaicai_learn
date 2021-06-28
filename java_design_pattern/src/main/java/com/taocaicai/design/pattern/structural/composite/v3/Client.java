package com.taocaicai.design.pattern.structural.composite.v3;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 06:37:6:37
 * @description TODO
 */
public class Client {
  public static void main(String[] args) {
    float s = 0;
    Bags BigBag, mediumBag, smallRedBag, smallWhiteBag;
    Goods goods;
    BigBag = new Bags("大袋子");
    mediumBag = new Bags("中袋子");
    smallRedBag = new Bags("红色小袋子");
    smallWhiteBag = new Bags("白色小袋子");
    goods = new Goods("乐山特产", 2, 7.9f);
    smallRedBag.add(goods);
    goods = new Goods("小花生", 1, 9.9f);
    smallRedBag.add(goods);
    goods = new Goods("牛肉火锅底料", 11, 99);
    smallWhiteBag.add(goods);
    goods = new Goods("武夷山大红袍", 3, 180);
    smallWhiteBag.add(goods);
    goods = new Goods("景德镇瓷器", 1, 380);
    mediumBag.add(goods);
    mediumBag.add(smallRedBag);
    goods = new Goods("李宁牌运动鞋", 2, 515);
    BigBag.add(goods);

    goods = new Goods("金华火腿",2,788);
    mediumBag.add(goods);

    BigBag.add(smallWhiteBag);
    BigBag.add(mediumBag);


    System.out.println("您选购的商品有：");
    BigBag.show();
    s = BigBag.calculation();
    System.out.println("要支付的总价是：" + s + "元");
  }
}
