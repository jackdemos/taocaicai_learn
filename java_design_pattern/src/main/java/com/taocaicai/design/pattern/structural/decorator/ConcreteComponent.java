package com.taocaicai.design.pattern.structural.decorator;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-06-29 04:17:4:17
 * @description TODO
 */
public class ConcreteComponent implements Component{
    public ConcreteComponent(){
    System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
