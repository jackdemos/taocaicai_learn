package com.taocaicai.design.pattern.principle.crp;

import java.lang.annotation.Retention;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-28 03:53:3:53
 * @description TODO
 */
public class White implements IColor {
    @Override
    public String show() {
        return "白色";
    }
}
