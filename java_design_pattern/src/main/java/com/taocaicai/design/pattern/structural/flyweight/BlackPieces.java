package com.taocaicai.design.pattern.structural.flyweight;

import java.awt.*;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 05:51:5:51
 * @description TODO
 */
public class BlackPieces implements ChessPieces{
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
