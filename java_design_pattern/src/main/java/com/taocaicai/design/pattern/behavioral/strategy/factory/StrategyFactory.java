package com.taocaicai.design.pattern.behavioral.strategy.factory;

import java.util.HashMap;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 04:30:4:30
 * @description TODO
 */
public class StrategyFactory {
    static HashMap<String, Strategy> strategys = new HashMap();

    public void put(String key, Strategy strategy) {
        strategys.put(key, strategy);
    }

    public Strategy get(String key) {
        return strategys.get(key);
    }

    public void strategyMethod(String key) {
        strategys.get(key).strategyMethod();
    }


}
