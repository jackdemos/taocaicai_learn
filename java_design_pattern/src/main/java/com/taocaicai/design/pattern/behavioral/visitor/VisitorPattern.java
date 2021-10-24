package com.taocaicai.design.pattern.behavioral.visitor;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-10-24 12:52:12:52
 * @package com.taocaicai.design.pattern.behavioral.visitor
 * @description 访问者模式包含以下主要角色。
 *     1. 抽象访问者（Visitor）角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit()
 *           ，该操作中的参数类型标识了被访问的具体元素。
 *     2. 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 *     3. 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 *     4. 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this)
 *         ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 *     5. 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由
 *     List、Set、Map 等聚合类实现。
 * </p>
 * @since: 0.0.0.1
 */
public class VisitorPattern {
  public static void main(String[] args) {
    ObjectStructure os = new ObjectStructure();
    os.add(new ConcreteElementA());
    os.add(new ConcreteElementB());
    Visitor visitor = new ConcreteVisitorA();
    os.accept(visitor);
    System.out.println("------------------------");
    visitor = new ConcreteVisitorB();
    os.accept(visitor);
  }
}
