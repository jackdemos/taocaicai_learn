package com.taocaicai.design.pattern.structural.flyweight;

import java.awt.*;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 05:49:5:49
 * @description TODO
 */
//抽象享元角色：棋子
interface ChessPieces {
    public void downPieces(Graphics g, Point pt);    //下子
}
