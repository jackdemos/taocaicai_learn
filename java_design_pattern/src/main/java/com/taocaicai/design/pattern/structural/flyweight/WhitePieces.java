package com.taocaicai.design.pattern.structural.flyweight;

import java.awt.*;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 05:50:5:50
 * @description 白棋子
 */
public class WhitePieces implements ChessPieces{
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
